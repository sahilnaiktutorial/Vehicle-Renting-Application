package com.jsp.vra.requestdto;

import com.jsp.vra.enums.FuelType;
import com.jsp.vra.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleRequest {

    private String brand;

    private VehicleType vehicleType;

    private String model;

    private FuelType fuelType;
}
