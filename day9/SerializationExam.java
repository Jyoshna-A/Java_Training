package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	transient private int eid;   //U CAN PREVENT CERTAIN DATA  NOT TO SERIALIZE
	private String ename;
	private int salary;
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}
public class SerializationExam 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Employee e=new Employee(12,"jyoshna",60000);
	
	FileOutputStream fp=new FileOutputStream("D://ObjectFile.txt");
	ObjectOutputStream object=new ObjectOutputStream(fp);
	object.writeObject(e);
	object.close();
	fp.close();
	System.out.println("Object Saved");
	
	
	FileInputStream fin=new FileInputStream("D://ObjectFile.txt");
	ObjectInputStream objectin=new ObjectInputStream(fin);
	Employee emp=(Employee)objectin.readObject();
	objectin.close();
	
	fin.close();
	System.out.println(emp);
	
	}

}
