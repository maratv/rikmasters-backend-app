package com.vakhitov.carsandparts.service;

import com.vakhitov.carsandparts.model.Car;
import com.vakhitov.carsandparts.repository.CarsRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService{

    private final CarsRepository carsRepository;

    @Override
    public List<Car> getCarsList() {
        return carsRepository.findAll();
    }
}
