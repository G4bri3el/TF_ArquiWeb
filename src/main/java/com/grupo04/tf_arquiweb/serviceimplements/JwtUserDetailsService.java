package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Usuario;
import com.grupo04.tf_arquiweb.repositories.IUsuarioRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario user = repo.findByUsername(username);

        if(user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }


        List<GrantedAuthority> roles = new ArrayList<>();


        roles.add(new SimpleGrantedAuthority(user.getRoles().getRol()));




        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getUsuarioCorreo(), user.getUsuarioContrasena(), true, true, true, true, roles);

        return ud;
    }
}
