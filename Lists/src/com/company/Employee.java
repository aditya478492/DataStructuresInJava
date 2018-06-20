package com.company;

public class Employee {
    private String name;
    private String country;
    private int salary;

    public Employee(String name, String country, int salary) {
        this.name = name;
        this.country = country;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp Name:"+name+" Emp Country:"+country+" Emp Salary:"+salary;
    }
}
