package com.vakhitov.carsandparts.repository;

import com.vakhitov.carsandparts.model.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PartsRepository extends JpaRepository<Part, Long> {
}
