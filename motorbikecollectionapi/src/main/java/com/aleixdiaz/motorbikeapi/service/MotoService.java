package com.aleixdiaz.motorbikeapi.service;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import com.aleixdiaz.motorbikeapi.entity.Owner;
import com.aleixdiaz.motorbikeapi.repository.MotoRepository;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class MotoService {

    @Autowired
    MotoRepository motoRepository;

    //GET
    public List<Motorbike> getAll(){
        return motoRepository.findAll().stream().sorted(Comparator.comparing(Motorbike::getId)).toList();
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
            Motorbike fasterBike = motoRepository.findAll().stream().max(Comparator.comparing(Motorbike::getHorsePower)).get();
            return fasterBike.getBrand() + " " + fasterBike.getModel() + " is the fastest bike";

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
            Motorbike bike = getBike(id);
            bike.setBrand(updatedBike.getBrand());
            bike.setModel(updatedBike.getModel());
            bike.setYear(updatedBike.getYear());
            bike.setHorsePower(updatedBike.getHorsePower());
            bike.setCubicCentimeters(updatedBike.getCubicCentimeters());
            bike.setCollectionId(updatedBike.getCollectionId());
            return motoRepository.save(bike);
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
