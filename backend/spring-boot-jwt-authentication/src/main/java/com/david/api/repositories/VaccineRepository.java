package com.david.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.api.models.Vaccine;

public interface VaccineRepository extends JpaRepository <Vaccine, Integer> {

}
