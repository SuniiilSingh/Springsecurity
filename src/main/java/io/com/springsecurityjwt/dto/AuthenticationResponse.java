package io.com.springsecurityjwt.dto;

import java.io.Serializable;
/**
 * 
 * @author ssing109
 *
 */
public class AuthenticationResponse implements Serializable {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
