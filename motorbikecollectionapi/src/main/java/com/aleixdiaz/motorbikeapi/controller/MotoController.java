package com.aleixdiaz.motorbikeapi.controller;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import com.aleixdiaz.motorbikeapi.entity.Owner;
import com.aleixdiaz.motorbikeapi.repository.MotoRepository;
import com.aleixdiaz.motorbikeapi.service.MotoService;
import org.apache.coyote.Response;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motorbikes")
public class MotoController {


    @Autowired
    MotoService motoService;


    //GET
    @GetMapping("/Aleix")
    public List<Motorbike> Aleix(){
        return motoService.Aleix();
    }

    @GetMapping
    public List<Motorbike> getAll(){
        return motoService.getAll();
    }

    @GetMapping("/getBike/{id}")
    public Motorbike getMotoById(@PathVariable int id) {
        return motoService.getBike(id);
    }

    @GetMapping("/compare/{bikeOneId}/{bikeTwoId}")
    public String compare(@PathVariable int bikeOneId, @PathVariable int bikeTwoId) {
       return motoService.compareBikes(bikeOneId, bikeTwoId);
    }

    @GetMapping("/collection/{collectionId}")
    public List<Motorbike> getCollection(@PathVariable int collectionId){
        return motoService.getCollection(collectionId);
    }

    //PUT
    @PutMapping("/{id}")
    public Motorbike update(@PathVariable Integer id, @RequestBody Motorbike motorbike){return motoService.updateBike(id, motorbike);
    }

    //POST
    @PostMapping
    public Motorbike newBike(@RequestBody Motorbike newBike){
        return motoService.newBike(newBike);
    }

    //DELETE
    @DeleteMapping("/deleteBike/{id}")
    public String deleteBike(@PathVariable int id){
        motoService.deleteBike(id);
        return "Bike deleted succesfully";
    }

    @DeleteMapping("/deleteCollection/{collectionId}")
    public String deleteCollection(@PathVariable int collectionId){
        motoService.deleteCollection(collectionId);
        return "Collection deleted succesfully";
    }
}
