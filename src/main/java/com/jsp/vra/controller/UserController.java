package com.jsp.vra.controller;

import com.jsp.vra.requestdto.UserRequest;
import com.jsp.vra.responsedto.UserResponse;
import com.jsp.vra.responsedto.VehicleResponse;
import com.jsp.vra.service.UserService;
import com.jsp.vra.utility.ResponseStructure;
import com.jsp.vra.utility.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
public class UserController {

     private RestResponseBuilder restResponseBuilder;

     private UserService userService;

//     @PostMapping("/customers")
//     ResponseEntity<ResponseStructure<UserResponse>> addCustomer(@RequestPart UserRequest userRequest, MultipartFile imageFile){
//         UserResponse userResponse = userService.addCustomer(userRequest,imageFile);
         @PostMapping("/customers")
         ResponseEntity<ResponseStructure<UserResponse>> addCustomer(@RequestBody UserRequest userRequest){
             UserResponse userResponse = userService.addCustomer(userRequest);
         return restResponseBuilder.success(HttpStatus.ACCEPTED.value(), "Customer Added", userResponse);
     }

    @PutMapping("/customers/{useId}")
    ResponseEntity<ResponseStructure<UserResponse>> updateCustomer(@RequestBody UserRequest userRequest, @PathVariable int userId){
        UserResponse userResponse = userService.updateCustomer(userRequest,userId);
        return restResponseBuilder.success(HttpStatus.ACCEPTED.value(), "Customer Added", userResponse);
    }

    @DeleteMapping("/customers/{userId}")
    ResponseEntity<ResponseStructure<UserResponse>> deleteCustomer(@PathVariable int userId){
        UserResponse userResponse = userService.deleteCustomer(userId);
        return restResponseBuilder.success(HttpStatus.ACCEPTED.value(), "vehicles Deleted", userResponse);
    }

}
