package com.aleixdiaz.motorbikeapi.controller;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import com.aleixdiaz.motorbikeapi.entity.Owner;
import com.aleixdiaz.motorbikeapi.service.MotoService;
import com.aleixdiaz.motorbikeapi.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    @GetMapping
    public List<Owner> getAll() {return ownerService.getAllOwners();}

    @GetMapping("/finById/{id}")
    public Owner getOwner(@PathVariable("id") int id) {
        return ownerService.findById(id);
    }

    @PostMapping()
    public Owner newOwner(@RequestBody Owner owner) {return ownerService.newOwner(owner);}

}
