package com.jsp.vra.entity;

import com.jsp.vra.enums.FuelType;
import com.jsp.vra.enums.VehicleType;
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
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;

    private String brand;

    private VehicleType vehicleType;

    private String model;

    private FuelType fuelType;

    @ManyToOne
    private VehicleListing vehicleListing;
}
