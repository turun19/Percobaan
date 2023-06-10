package org.binar.kamihikoukiairlines.jwt;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class AuthenticationResponse {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private List<String> roles;
    private String jwt;

    public AuthenticationResponse(Long id, String name, String email, String passwprd, String phoneNumber, List<String> roles, String jwt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = passwprd;
        this.phoneNumber = phoneNumber;
        this.roles = roles;
        this.jwt = jwt;
    }
}
