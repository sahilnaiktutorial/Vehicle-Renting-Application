package com.jsp.vra.requestdto;

import com.jsp.vra.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserRequest {

    private String username;
    private String email;
    private  String phoneNumber;
    private  String password;
    private Role role;
}
