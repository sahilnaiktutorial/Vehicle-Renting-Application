package com.jsp.vra.responsedto;

import com.jsp.vra.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserResponse {
    private String username;
    private String email;
    private  String phoneNumber;
    private Role role;
}
