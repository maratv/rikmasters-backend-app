package com.vakhitov.carsandparts.repository;

import com.vakhitov.carsandparts.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarsRepository extends JpaRepository<Car, UUID> {
}
