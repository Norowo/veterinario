package com.david.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.api.models.Owner;


public interface OwnerRepository extends JpaRepository<Owner, String> {

}
