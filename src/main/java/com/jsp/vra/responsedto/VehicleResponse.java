package com.jsp.vra.responsedto;

import com.jsp.vra.enums.FuelType;
import com.jsp.vra.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VehicleResponse {


    private String brand;
    private VehicleType vehicleType;
    private String model;
    private FuelType fuelType;
}
