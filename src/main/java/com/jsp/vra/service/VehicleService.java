package com.jsp.vra.service;

import com.jsp.vra.requestdto.VehicleRequest;
import com.jsp.vra.responsedto.VehicleResponse;

public interface VehicleService {
    VehicleResponse addVehicle(VehicleRequest vehicleRequest);

    VehicleResponse updateVehicle(VehicleRequest vehicleRequest, int vehicleId);

    VehicleResponse deleteVehicle(int vehicleId);
}
