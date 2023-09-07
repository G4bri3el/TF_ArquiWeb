package com.grupo04.tf_arquiweb.security;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.function.Function;

public class JwtTokenUtil implements Serializable {

    private static final long serialVersionUID = -2550185165626007488L;

    //milisegundos || 18 minutos, le quitamos mil 18 segundos
    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60 * 1000;


    @Value("${jwt.secret}")
    private String secret;

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }
    //for retrieveing any information from token we will need the secret key
    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }
}
