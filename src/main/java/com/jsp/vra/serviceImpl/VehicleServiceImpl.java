package com.jsp.vra.serviceImpl;

import com.jsp.vra.entity.User;
import com.jsp.vra.entity.Vehicle;
import com.jsp.vra.repository.VehicleRepository;
import com.jsp.vra.requestdto.VehicleRequest;
import com.jsp.vra.responsedto.VehicleResponse;
import com.jsp.vra.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;



    private VehicleResponse getVehicleResponse(Vehicle vehicle) {
        return VehicleResponse.builder()
                .brand(vehicle.getBrand())
                .vehicleType(vehicle.getVehicleType())
                .fuelType(vehicle.getFuelType())
                .model(vehicle.getModel())
                .build();
    }

    private Vehicle mapToVehicle(VehicleRequest vehicleRequest, Vehicle vehicle) {

        return vehicle;
    }

    @Override
    public VehicleResponse addVehicle(VehicleRequest vehicleRequest) {
        return null;
    }

    @Override
    public VehicleResponse updateVehicle(VehicleRequest vehicleRequest, int vehicleId) {
        return null;
    }

    @Override
    public VehicleResponse deleteVehicle(int vehicleId) {
        return null;
    }
}
