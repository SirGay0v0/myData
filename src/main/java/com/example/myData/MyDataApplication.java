package com.example.myData;

import com.example.myData.controller.PersonController;
import com.example.myData.dto.Person;
import com.example.myData.repository.PersonRep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyDataApplication.class, args);
    }

}
