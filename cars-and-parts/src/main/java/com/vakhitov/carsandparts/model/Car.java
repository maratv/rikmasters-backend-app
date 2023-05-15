package com.vakhitov.carsandparts.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vin;

    private String registrationNumber;

    private String model;

    private String manufacturer;

    private Integer yearOfManufacture;

    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    private List<Part> parts;

    private String ownersPassport;


}
