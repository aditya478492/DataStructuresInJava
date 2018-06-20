package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee("Ram","Canada",70));
        emp.add(new Employee("Ramesh","India",100));
        emp.add(new Employee("Suresh","USA",90));
        emp.add(new Employee("Sam","Germany",80));

        for(int i=0;i<emp.size();i++){
            System.out.println(emp.get(i));
        }
    }
}
