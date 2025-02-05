package com.celcom.day2;

public class ClassesAndObjectsExample3 {
    public static void main(String[] args) {
        Employee3 e = new Employee3(12, "Rama", 523.5f);
        e.display();
        e.setsalary(5000.2f);
        e.display();
    }
}

class Employee3 {
    int empid;
    String name;
    float salary;

    
    Employee3(int empid, String name, float salary) {
        this.empid = empid;
        this.name = name; 
        this.salary = salary;
    }

    
    void display() {
        System.out.println("The Employee id is " + empid);
        System.out.println("The Employee name is " + name);
        System.out.println("The Salary of Employee is " + salary);
    }
   void setsalary(float salary)
   {
	   this.salary=salary;
   }
}
