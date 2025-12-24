package com.example.vehicle_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId; // [cite: 17]
    private String vehicleType; // [cite: 16]
    private int serviceYear; // [cite: 13]

    // Default Constructor
    public Vehicle() {}

    // Getters and Setters
    public Long getServiceId() { return serviceId; }
    public void setServiceId(Long serviceId) { this.serviceId = serviceId; }
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public int getServiceYear() { return serviceYear; }
    public void setServiceYear(int serviceYear) { this.serviceYear = serviceYear; }
}