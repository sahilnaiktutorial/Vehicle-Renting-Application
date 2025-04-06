package com.jsp.vra.entity;

import com.jsp.vra.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String username;
    private String email;
    private  String phoneNumber;
    private  String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    // to add image to the database
//    private String imageName;
//    private String imageType;
//    private byte[] imageData;

//    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
//   private List<Booking> bookingList;
//    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
//    private List<Review> reviewList;
    @OneToOne(mappedBy = "rentingPartner")
    private List<VehicleListing> vehicleListingList;


}
