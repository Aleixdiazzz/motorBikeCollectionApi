package com.aleixdiaz.motorbikeapi.repository;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends JpaRepository<Motorbike, Integer> {

}
