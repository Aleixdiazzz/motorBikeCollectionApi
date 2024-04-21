package com.aleixdiaz.motorbikeapi.repository;

import com.aleixdiaz.motorbikeapi.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
