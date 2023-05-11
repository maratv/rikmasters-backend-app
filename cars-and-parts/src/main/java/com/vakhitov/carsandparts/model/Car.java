package com.vakhitov.carsandparts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Car {
    @Id
    private UUID id;

    private String password;
}
