package com.example.vehicle_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
    // 1. වසර අනුව වාහන සෙවීමට [cite: 13]
    List<Vehicle> findByServiceYear(int serviceYear);

    // 2. ID එක ලබා දී වාහන වර්ගය පමණක් ලබා ගැනීමට [cite: 17]
    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = ?1")
    String findVehicleTypeByServiceId(Long serviceId);

    // 3. වසර අනුව වාර්තා මකා දැමීමට [cite: 21]
    void deleteByServiceYear(int serviceYear);
}