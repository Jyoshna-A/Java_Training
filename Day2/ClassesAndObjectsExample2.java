package com.celcom.day2;

public class ClassesAndObjectsExample2 {
    public static void main(String[] args) {
        Employee1 e = new Employee1(12, "Rama", 523.5f);
        e.display();
    }
}

class Employee1 {
    int empid;
    String name;
    float salary;

    
    Employee1(int id, String name1, float d) {
        empid = id;
        name = name1; 
        salary = d;
    }

    
    void display() {
        System.out.println("The Employee id is " + empid);
        System.out.println("The Employee name is " + name);
        System.out.println("The Salary of Employee is " + salary);
    }
}
