package com.example.myData.controller;

import com.example.myData.dto.Person;
import com.example.myData.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

@RequestMapping(name = "", produces = "application/json")
public class PersonController {

    @Autowired
    PersonRep personRep;

    @RequestMapping("create-person")
    public Person createPerson() {
        return personRep.save(new Person("Clara"));
    }

    @RequestMapping("find/{id}")
    public Optional<Person> findPerson(@PathVariable Long id) {
        return personRep.findById(id);
    }

    @RequestMapping("delete/{id}")
    public void deletePerson(@PathVariable Long id) {
        personRep.deleteById(id);
    }

    @RequestMapping("findAll")
    public void findAll() {
        personRep.findAll();
    }

    @RequestMapping("deleteAll")
    public void deleteAll() {
        personRep.deleteAll();
    }
}