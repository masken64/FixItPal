package com.masken.fixitpal_backend_api.services;

import com.masken.fixitpal_backend_api.models.User;
import com.masken.fixitpal_backend_api.payloads.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO user);
    UserDTO updateUser(UserDTO user, Integer user_id);
    UserDTO getUser(UserDTO user_id);
    List<UserDTO> getAllUsers();
    void deleteUser(Integer user_id);
}
