package com.masken.fixitpal_backend_api.services.impl;

import com.masken.fixitpal_backend_api.models.User;
import com.masken.fixitpal_backend_api.payloads.UserDTO;
import com.masken.fixitpal_backend_api.repos.UserRepo;
import com.masken.fixitpal_backend_api.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepo userRepo;
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = this.dtoToUser(userDTO);
        User savedUser = this.userRepo.save(user);
        return this.userToDto(savedUser);
    }
    @Override
    public UserDTO updateUser(UserDTO user, Integer user_id) {
        return null;
    }

    @Override
    public UserDTO getUser(UserDTO user_id) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer user_id) {

    }

    public User dtoToUser(UserDTO userDTO){
        User user = new User();
        user.setUser_id(userDTO.getUser_id());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setAbout_me(userDTO.getAbout_me());
        return user;
    }


    public UserDTO userToDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUser_id(user.getUser_id());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setAbout_me(user.getAbout_me());
        return userDTO;
    }
}
