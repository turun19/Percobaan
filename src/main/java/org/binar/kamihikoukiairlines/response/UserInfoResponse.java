package org.binar.kamihikoukiairlines.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserInfoResponse {
    private String response;
    private String message;
    private String token;


    public UserInfoResponse(String response, String message, String token) {
        this.response = response;
        this.message = message;
        this.token = token;
    }
}
