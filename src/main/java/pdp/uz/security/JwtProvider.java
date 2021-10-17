package pdp.uz.security;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import pdp.uz.entity.Role;

import java.util.Date;

@Component
public class JwtProvider {

    private static Long expireDate = 10000000L;
    private static String key = "secret";

    public String generateToken(String username, Role role) {

        String token = Jwts
                .builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expireDate))
                .claim("roles", role.getRoleType())
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        return token;
    }

    public String getEmailFromToken(String token) {
        try {
            String email = Jwts
                    .parser()
                    .setSigningKey(key)
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
            return email;
        } catch (Exception e) {
            return null;
        }
    }
}
