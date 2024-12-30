package com.devreads.dev_reads.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
/*@AllArgsConstructor
@NoArgsConstructor*/
public class UserDTO {
    private String email;
    private String username;
    private String password;
}
