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

    private Usuario userdetail;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        userdetail = repo.findByUsuarionombre(username);

        if (!Objects.isNull(userdetail)) {

            return new org.springframework.security.core.userdetails.User(userdetail.getUsuariocorreo(), userdetail.getUsuariocontrasena(), new ArrayList<>());

        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }

    public Usuario getUsuarioDetail(){
        return userdetail;
    }


}
