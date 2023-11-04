package com.masken.fixitpal_backend_api.repos;

import com.masken.fixitpal_backend_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
