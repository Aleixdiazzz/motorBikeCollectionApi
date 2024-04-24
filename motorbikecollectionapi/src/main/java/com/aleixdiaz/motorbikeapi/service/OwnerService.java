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
    @Autowired
    private MotoService motoService;
    @Autowired
    private MotoRepository motoRepository;

    //GET
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
            int ownerOneCollectionid = getOwner(ownerOne).getCollectionId();
            int ownerTwoCollectionid = getOwner(ownerTwo).getCollectionId();
            int ownerOneCollectionSize = 0;
            int ownerTwoCollectionSize = 0;
            List<Motorbike> allBikes = motoRepository.findAll();
            for (Motorbike motorbike: allBikes) {
                if (motorbike.getCollectionId() == ownerOneCollectionid) {
                    ownerOneCollectionSize++;
                }
                if (motorbike.getCollectionId() == ownerTwoCollectionid) {
                    ownerTwoCollectionSize++;
                    // comment
                }
            }

            if (ownerOneCollectionSize > ownerTwoCollectionSize) {
                return ("Owner " + getOwner(ownerOne).getName() + " " + getOwner(ownerOne).getSurname() + " Has a bigger collection than " + getOwner(ownerTwo).getName() + " " + getOwner(ownerTwo).getSurname());
            }
            if (ownerTwoCollectionSize > ownerOneCollectionSize) {
                return ("Owner " + getOwner(ownerTwo).getName() + " " + getOwner(ownerTwo).getSurname() + " Has a bigger collection than " + getOwner(ownerOne).getName() + " " + getOwner(ownerOne).getSurname());
            }
            return "Both collections are equal";
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
            Owner oldOwner = getOwner(id);
            oldOwner.setName(updatedOwner.getName());
            oldOwner.setSurname(updatedOwner.getSurname());
            oldOwner.setPhone(updatedOwner.getPhone());
            oldOwner.setAge(updatedOwner.getAge());
            oldOwner.setEmail(updatedOwner.getEmail());
            oldOwner.setCollectionId(updatedOwner.getCollectionId());
            return oldOwner;
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
