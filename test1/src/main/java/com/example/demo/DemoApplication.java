package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

  public  static List<Double> aa;

    public static void main(String[] args) {

        aa = new ArrayList<>();

        SpringApplication.run(DemoApplication.class, args);
    }
}
