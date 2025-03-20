package com.jsp.vra.controller;

import com.jsp.vra.requestdto.VehicleRequest;
import com.jsp.vra.responsedto.VehicleResponse;
import com.jsp.vra.service.VehicleService;
import com.jsp.vra.utility.ResponseStructure;
import com.jsp.vra.utility.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class VehicleController {

    private RestResponseBuilder restResponseBuilder;

    private VehicleService vehicleService;


    @PostMapping("/vehicles")
    ResponseEntity<ResponseStructure<VehicleResponse>> addVehicle(@RequestBody VehicleRequest vehicleRequest){
        VehicleResponse vehicleResponse = vehicleService.addVehicle(vehicleRequest);
        return restResponseBuilder.success(HttpStatus.ACCEPTED.value(), "vehicle Added", vehicleResponse);
    }

    @PutMapping("/vehicles/{vehicleId}")
    ResponseEntity<ResponseStructure<VehicleResponse>> updateVehicle(@RequestBody VehicleRequest vehicleRequest, @PathVariable int vehicleId){
        VehicleResponse vehicleResponse = vehicleService.updateVehicle(vehicleRequest,vehicleId);
        return restResponseBuilder.success(HttpStatus.ACCEPTED.value(), "vehicle Updated", vehicleResponse);
    }

    @DeleteMapping("/vehicles/{vehicleId}")
    ResponseEntity<ResponseStructure<VehicleResponse>> deleteVehicle(@PathVariable int vehicleId){
        VehicleResponse vehicleResponse = vehicleService.deleteVehicle(vehicleId);
        return restResponseBuilder.success(HttpStatus.ACCEPTED.value(), "vehicle Deleted", vehicleResponse);
    }
}
