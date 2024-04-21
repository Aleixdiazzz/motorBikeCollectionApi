package com.aleixdiaz.motorbikeapi.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Owner {

    //CONSTRUCTORS
    public Owner() {
    }

    public Owner(Integer id, String name, String surname, int age, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.email = email;
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
    private String phone;
    private String email;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

}
