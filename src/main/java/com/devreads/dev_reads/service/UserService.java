package com.devreads.dev_reads.service;

import com.devreads.dev_reads.dto.UserDTO;

public interface UserService {
    void createNewUser(UserDTO userDTO);
    void login(String email, String password);
}
