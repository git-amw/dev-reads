package com.devreads.dev_reads.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    private String email;
    private String username;
    private String password;
    private Date createdAt;
}
