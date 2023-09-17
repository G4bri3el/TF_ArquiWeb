package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Usuario;
import com.grupo04.tf_arquiweb.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario userdetail = repo.findByUsername(username);

        if (!Objects.isNull(userdetail)) {

            return new org.springframework.security.core.userdetails.User(userdetail.getUsuarioCorreo(), userdetail.getUsuarioContrasena(), new ArrayList<>());

        } else {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }
    }


}
