package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Usuario;
import com.grupo04.tf_arquiweb.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository repo;

    private Usuario userdetail;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        userdetail = repo.findByUsuarionombre(username);
        /*
        if (!Objects.isNull(userdetail)) {

            return new org.springframework.security.core.userdetails.User(userdetail.getUsuariocorreo(), userdetail.getUsuariocontrasena(), new ArrayList<>());

        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

         */

        if(userdetail == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }


        List<GrantedAuthority> roles = new ArrayList<>(1);
        roles.add(new SimpleGrantedAuthority(userdetail.getRoles().getRol()));

        UserDetails ud = new org.springframework.security.core.userdetails.User(userdetail.getUsuarionombre(), userdetail.getUsuariocontrasena(), userdetail.isUsuarioenabled(), true, true, true, roles);

        return ud;
    }

    public Usuario getUsuarioDetail(){
        return userdetail;
    }


}
