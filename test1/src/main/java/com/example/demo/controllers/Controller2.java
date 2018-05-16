package com.example.demo.controllers;

import com.example.demo.services.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class Controller2 {

    @Autowired
    Service2 service2;


    @GetMapping("/getSrednia/{liczba}")
    public @ResponseBody ResponseEntity<List<Double>> getSrednia(@PathVariable int liczba){

        return new ResponseEntity<>(service2.getSrednia(liczba),HttpStatus.OK);
    }



}
