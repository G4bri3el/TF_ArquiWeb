package com.grupo04.tf_arquiweb.serviceimplements;


import com.grupo04.tf_arquiweb.entities.Usuario;;
import com.grupo04.tf_arquiweb.repositories.IUsuarioRepository;
import com.grupo04.tf_arquiweb.security.JwtTokenUtil;
import com.grupo04.tf_arquiweb.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int UsuarioId) {
        uR.deleteById(UsuarioId);
    }


    //------------------------------------------
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        return null;
    }
    @Override
    public ResponseEntity<String> login(Map<String, String> requestMap) {

        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(requestMap.get("usuario_correo"), requestMap.get("usuario_contrasena"))
            );

            if (authentication.isAuthenticated()){

                return new ResponseEntity<String>("{\"token\":\""+
                        jwtTokenUtil.generateToken(jwtUserDetailsService.getUsuarioDetail().getUsuariocorreo(),
                        jwtUserDetailsService.getUsuarioDetail().getNombreRol()) +"\"}", HttpStatus.OK);

            }
        }catch (Exception exception){

        }

        return new ResponseEntity<>("{\"mensaje\":\""+" Credenciales incorrectas "+"\"}", HttpStatus.BAD_REQUEST);

    }


}
