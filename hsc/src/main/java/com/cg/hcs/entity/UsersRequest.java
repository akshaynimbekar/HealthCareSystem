package com.cg.hcs.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersRequest {
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String roles;
}
