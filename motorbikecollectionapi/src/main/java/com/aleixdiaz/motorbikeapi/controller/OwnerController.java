package com.aleixdiaz.motorbikeapi.controller;

import com.aleixdiaz.motorbikeapi.entity.Motorbike;
import com.aleixdiaz.motorbikeapi.entity.Owner;
import com.aleixdiaz.motorbikeapi.service.MotoService;
import com.aleixdiaz.motorbikeapi.service.OwnerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    //GET
    @GetMapping
    public List<Owner> getAll() {return ownerService.getAllOwners();}

    //path(?)
    @GetMapping("/findById/{id}")
    public Owner getOwner(@PathVariable("id") int id) {
        return ownerService.findById(id);
    }

    @GetMapping("/compareCollection/{ownerOne}/{ownerTwo}")
    public String compareCollection(@PathVariable("ownerOne") int ownerOne, @PathVariable("ownerTwo") int ownerTwo) {
        return ownerService.compareCollection(ownerOne, ownerTwo);
    }

    //PUT
    @PutMapping("/{id}")
    public Owner update(@PathVariable Integer id, @RequestBody Owner owner){return ownerService.update0wner(id, owner);
    }

    //POST
    @PostMapping()
    public Owner newOwner(@RequestBody Owner owner) {return ownerService.newOwner(owner);}

    //DELETE
    @DeleteMapping("{id}")
    public String deleteOwner(@PathVariable int id) {
        ownerService.deleteOwner(id);
        return "Successfully deleted owner with id: " + id;
    }

}
