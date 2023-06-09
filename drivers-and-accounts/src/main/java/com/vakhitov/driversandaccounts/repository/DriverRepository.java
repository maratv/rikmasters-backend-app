package com.vakhitov.driversandaccounts.repository;

import com.vakhitov.driversandaccounts.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    Optional<Driver> findByCarsRegistrationNumber(String number);

    Optional<Driver> findByPassport(String passport);
}
