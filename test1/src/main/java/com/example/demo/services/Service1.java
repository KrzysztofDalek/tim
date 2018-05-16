package com.example.demo.services;

import com.example.demo.DemoApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Service1 implements DemoService{

    @Override
    public List<Double> getList() {
        double srednia = 0.0;
        double suma = 0;

        List<Double> list ;
        list = DemoApplication.aa;
        for(int i=0; i<list.size(); i++)
        {

            suma = suma + list.get(i);
            //System.out.print(list.get(i));
           // System.out.print('\n');
        }
        srednia= suma/list.size();
        ArrayList<Double> srednia2 = new ArrayList<>(1);
        srednia2.add(srednia);
       // System.out.print(suma);
       // System.out.print(srednia);
        return srednia2;
    }
}
