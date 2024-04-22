package com.aleixdiaz.motorbikeapi.service;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import com.aleixdiaz.motorbikeapi.entity.Owner;
import com.aleixdiaz.motorbikeapi.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotoService {

    @Autowired
    MotoRepository motoRepository;

    //GET
    public List<Motorbike> getAll(){
        return motoRepository.findAll();
    }

    public List<Motorbike> Aleix() {
        try {
            List<Motorbike> aleixsBikes = new ArrayList<Motorbike>();
            aleixsBikes.add(new Motorbike("Honda", "VFR RC36", 1992, 120, 750, "Aleix", 1));
            aleixsBikes.add(new Motorbike("Honda", "CRF 250L", 2017, 35, 249,"Aleix", 1));
            aleixsBikes.add(new Motorbike("Triumph", "Bonneville", 2001, 80, 800,"Aleix", 1));
            return aleixsBikes;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Motorbike getBike(int id){
        try {
            return motoRepository.findById(id).get();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String compareBikes(int bikeOneId, int bikeTwoId){
        try {
            Motorbike bikeOne = getBike(bikeOneId);
            Motorbike bikeTwo = getBike(bikeTwoId);
            if (bikeOne.getHorsePower() > bikeTwo.getHorsePower()){
                return (bikeOne.getModel() + " Is faster than " + bikeTwo.getModel());
            }
            if (bikeOne.getHorsePower() < bikeTwo.getHorsePower()){
                return (bikeTwo.getModel() + " Is faster than " +bikeOne.getModel());
            }
            else {
                return "Both bikes have the same power";
            }
        }
        catch (Exception e) {
            System.out.println(e);
            return "Bike not found";
        }
    }

    public List<Motorbike> getCollection(int collectionId){
        try{
           return motoRepository.findAll().stream().filter(motorbike -> motorbike.getCollectionId() == collectionId).toList();
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //POST
    public Motorbike newBike(Motorbike newBike){
        try {
            return motoRepository.save(newBike);
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


    //PUT
    public Motorbike updateBike(int id, Motorbike updatedBike){
        try {
            Motorbike oldBike = getBike(id);
            oldBike.setBrand(updatedBike.getBrand());
            oldBike.setModel(updatedBike.getModel());
            oldBike.setYear(updatedBike.getYear());
            oldBike.setHorsePower(updatedBike.getHorsePower());
            oldBike.setCubicCentimeters(updatedBike.getCubicCentimeters());
            return oldBike;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //DELETE
    public void deleteBike(int id){
        try {
            motoRepository.deleteById(id);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCollection(int collectionId){
        try{
            List<Motorbike> bikes = getCollection(collectionId);
            bikes.forEach(motorbike->{deleteBike(motorbike.getId());});
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
