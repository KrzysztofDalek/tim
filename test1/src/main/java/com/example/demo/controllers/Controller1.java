package com.example.demo.controllers;

import com.example.demo.services.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class Controller1 {

    @Autowired
    Service1  service1;

    @GetMapping("/getList")
    public ResponseEntity <List<Double>> getList(){

        return new ResponseEntity<>(service1.getList(),HttpStatus.OK);
    }
}

