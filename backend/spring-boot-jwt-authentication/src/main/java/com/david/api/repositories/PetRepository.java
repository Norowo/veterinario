package com.david.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.api.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
