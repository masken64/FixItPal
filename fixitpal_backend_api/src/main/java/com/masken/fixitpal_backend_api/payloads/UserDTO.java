package com.masken.fixitpal_backend_api.payloads;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private int user_id;
    private String name;
    private String password;
    private String email;
    private String about_me;
}


