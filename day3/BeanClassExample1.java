package com.celcom.day3;

public class BeanClassExample1 
{
	private int eid;
	private String name;
	private int esalary;
	
	
	
	public BeanClassExample1() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public BeanClassExample1(int eid, String name, int esalary) {
		super();
		this.eid = eid;
		this.name = name;
		this.esalary = esalary;
	}




	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}




	public static void main(String[] args)
	{
		
		BeanClassExample1 obj=new BeanClassExample1();
		System.out.println(obj.eid);
		System.out.println(obj.esalary);
		System.out.println(obj.name);
		obj.setEid(1);
		System.out.println(obj.getEid());
		
	}

}
