package com.devreads.dev_reads.controller;

import com.devreads.dev_reads.dto.LoginDTO;
import com.devreads.dev_reads.dto.UserDTO;
import com.devreads.dev_reads.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        userService.createNewUser(userDTO);
        return new ResponseEntity<>("User is created", HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> userLogin(@RequestBody LoginDTO loginDTO) {
        userService.login(loginDTO.getEmail(), loginDTO.getPassword());
        return new ResponseEntity<>("User logged in successfully", HttpStatus.OK);
    }
}
