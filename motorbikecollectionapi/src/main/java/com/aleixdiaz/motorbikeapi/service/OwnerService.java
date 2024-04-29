package com.aleixdiaz.motorbikeapi.service;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import com.aleixdiaz.motorbikeapi.entity.Owner;
import com.aleixdiaz.motorbikeapi.repository.MotoRepository;
import com.aleixdiaz.motorbikeapi.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    private MotoRepository motoRepository;

    //GET
    public List<Owner> getAllOwners() {

        try {
            return ownerRepository.findAll().stream().sorted(Comparator.comparing(Owner::getId)).toList();
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

    public Owner getOwner(Integer id) {
        try {
            return ownerRepository.findById(id).get();
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public String compareCollection(int ownerOne, int ownerTwo) {
        try {
            Collection<Motorbike> onwerOneCollection = motoRepository.findAll().stream().filter(motorbike -> motorbike.getCollectionId() == ownerOne).toList();
            Collection<Motorbike> onwerTwoCollection = motoRepository.findAll().stream().filter(motorbike -> motorbike.getCollectionId() == ownerTwo).toList();
            if (onwerOneCollection.size() == onwerTwoCollection.size()){
                return "Both collections have the same amount of bikes";
            }
            return onwerOneCollection.size() > onwerTwoCollection.size() ? "Owner one has more bikes" : "Owner two has more bikes";
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //POST
    public Owner newOwner(Owner owner) {
        try{
            return ownerRepository.save(owner);
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //PUT
    public Owner update0wner(int id, Owner updatedOwner){
        try {
            Owner owner = getOwner(id);
            owner.setName(updatedOwner.getName());
            owner.setSurname(updatedOwner.getSurname());
            owner.setCollectionId(updatedOwner.getCollectionId());
            return ownerRepository.save(owner);
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //DELETE
    public void deleteOwner(int id) {
        try {
            ownerRepository.deleteById(id);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
