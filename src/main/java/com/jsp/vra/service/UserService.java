package com.jsp.vra.service;

import com.jsp.vra.requestdto.UserRequest;
import com.jsp.vra.responsedto.UserResponse;

public interface UserService {

//    UserResponse addCustomer(UserRequest userRequest, MultipartFile imageFile) throws IOException;
UserResponse addCustomer(UserRequest userRequest);

    UserResponse updateCustomer(UserRequest userRequest,int userId);
}
