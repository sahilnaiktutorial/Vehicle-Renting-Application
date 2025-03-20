package com.jsp.vra.serviceImpl;

import com.jsp.vra.entity.User;
import com.jsp.vra.exception.UserNotFoundByIdException;
import com.jsp.vra.repository.UserRepository;
import com.jsp.vra.requestdto.UserRequest;
import com.jsp.vra.responsedto.UserResponse;
import com.jsp.vra.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Override

//    public UserResponse addCustomer(UserRequest userRequest, MultipartFile imageFile) throws IOException {
        public UserResponse addCustomer(UserRequest userRequest) {
        User user = mapToUser(userRequest,new User());
//        user.setImageName(imageFile.getName());
//        user.setImageType(imageFile.getContentType());
//        user.setImageData(imageFile.getBytes());
        userRepository.save(user);
        return getUserResponse(user);
    }

    @Override
    public UserResponse updateCustomer(UserRequest userRequest,int userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundByIdException("Fail to find user"));
        User user1 = mapToUser(userRequest, user);
        userRepository.save(user1);
        return getUserResponse(user1);
    }

    private UserResponse getUserResponse(User user) {
        return UserResponse.builder()
                .email(user.getEmail())
                .role(user.getRole())
                .phoneNumber(user.getPhoneNumber())
                .username(user.getUsername())
                .build();
    }

    private User mapToUser(UserRequest userRequest,User user) {
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setRole(userRequest.getRole());
        user.setUsername(userRequest.getUsername());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        return user;
    }
}
