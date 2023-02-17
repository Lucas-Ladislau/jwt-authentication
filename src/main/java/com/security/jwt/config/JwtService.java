package com.security.jwt.config;

import java.security.Key;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;

@Service
public class JwtService {

    private final static String SECRET_KEY = "3777217A25432A462D4A614E645267556A586E3272357538782F413F4428472B";

    public String extractUserEmail(String jwt) {

        return null;
    }

    private Claims extractAllClaims(String token ){
        return Jwts.parserBuilder().setSigningKey(getSignKey()).build()
            .parseClaimsJws(token).getBody();
    }

    private Key getSignKey(){
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return null;
    }

}
