package com.example.demo.services;

import com.example.demo.DemoApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service

public class Service2 implements  DemoService2{

    private Random rnd = new Random();
    double transformacja;
    public List<Double> list2;

    @Override
    public List<Double> getSrednia(int liczba) {
        list2 = DemoApplication.aa;
        list2.clear();
        for (int i = 0; i < liczba; i++) {
            transformacja = rnd.nextInt(10);
            list2.add(transformacja);
           // System.out.print(transformacja);
          //  System.out.print('\n');
        }

        DemoApplication.aa = list2;

        return list2;
    }
}
