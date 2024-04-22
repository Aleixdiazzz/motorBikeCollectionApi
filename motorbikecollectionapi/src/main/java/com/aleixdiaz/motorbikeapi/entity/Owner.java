package com.aleixdiaz.motorbikeapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "OWNER")
public class Owner {

    //CONSTRUCTORS
    public Owner() {
    }

    public Owner(String name, String surname, int age, long phone, String email, int collectionId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.collectionId = collectionId;
    }

    //ATTRIBUTES, ID WITH GENERATED SEQUENCE
    @Id
    @SequenceGenerator(
            name = "owner_sequence",
            sequenceName = "owner_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "owner_sequence"
    )
    private Integer id;
    private String name;
    private String surname;
    private int age;
    private long phone;
    private String email;
    private int collectionId;


    //GETTERS AND SETTERS
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setCollectionId(int collectionId) {this.collectionId = collectionId;}

    public int getCollectionId() {return collectionId;}

}
