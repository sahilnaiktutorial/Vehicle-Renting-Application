package com.jsp.vra.entity;


import com.jsp.vra.enums.SeatingType;
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
public class VehicleListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int listingId;

    String vehicleNo;
    Double pricePerDay;
    SeatingType seating;

    @OneToOne
    User rentingPartner;

    @OneToMany(mappedBy = "vehicleListing")
    List<Vehicle> vehicles;

}


