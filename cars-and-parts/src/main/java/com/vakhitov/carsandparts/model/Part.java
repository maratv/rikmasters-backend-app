package com.vakhitov.carsandparts.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String serial;

    private String partsType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

}
