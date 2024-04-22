package com.aleixdiaz.motorbikeapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MOTORBIKE")
public class Motorbike {

    //CONSTRUCTORS
    public Motorbike() {

    }

    public Motorbike(String brand, String model, int year, int horsePower, int cubicCentimeters, String owner, int collectionId) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.cubicCentimeters = cubicCentimeters;
        this.collectionId = collectionId;
    }


    //ATTRIBUTES, ID WITH GENERATED SEQUENCE
    @Id
    @SequenceGenerator(
            name = "moto_sequence",
            sequenceName = "moto_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "moto_sequence"
    )
    private Integer id;
    private String brand;
    private String model;
    private int year;
    private int horsePower;
    private int cubicCentimeters;
    private int collectionId;


    //GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCubicCentimeters() {
        return cubicCentimeters;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setCubicCentimeters(int cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    public int getCollectionId() {return collectionId;}

    public void setCollectionId(int collectionId) {this.collectionId = collectionId;}

}
