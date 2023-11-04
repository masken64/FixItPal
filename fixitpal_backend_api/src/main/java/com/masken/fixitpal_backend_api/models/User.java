package com.masken.fixitpal_backend_api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    @Column(nullable = false, length = 255)
    private String name;
    @Column(nullable = false, length = 72)
    private String password;
    @Column(nullable = false, length = 255)
    private String email;
    @Column(nullable = true, length = 1200)
    private String about_me;
}
