package com.aleixdiaz.motorbikeapi.service;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import com.aleixdiaz.motorbikeapi.entity.Owner;
import com.aleixdiaz.motorbikeapi.repository.MotoRepository;
import com.aleixdiaz.motorbikeapi.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;

    public List<Owner> getAllOwners() {

        try {
            return ownerRepository.findAll();
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Owner findById(Integer id) {
        try{
            return ownerRepository.findById(id).orElse(null);
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Owner newOwner(Owner owner) {
        try{
            return ownerRepository.save(owner);
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
