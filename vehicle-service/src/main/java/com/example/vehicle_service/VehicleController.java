package com.example.vehicle_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    // 1. Get vehicles by year [cite: 14]
    @GetMapping("/year/{year}")
    public List<Vehicle> getVehiclesByYear(@PathVariable int year) {
        return vehicleRepository.findByServiceYear(year);
    }

    // 2. Get vehicle type by service ID [cite: 18]
    @GetMapping("/type/{id}")
    public String getVehicleType(@PathVariable Long id) {
        return vehicleRepository.findVehicleTypeByServiceId(id);
    }

    // 3. Delete records by year [cite: 23]
    @DeleteMapping("/delete/{year}")
    public String deleteRecordsByYear(@PathVariable int year) {
        vehicleRepository.deleteByServiceYear(year);
        return "Records deleted for year: " + year;
    }
}