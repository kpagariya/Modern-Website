package com.test;

// Object is the parent of all the java classes.
// Student is derived from Object class.
public class Student {
	private int id;
	private String name;
	
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		System.out.println("Equals method called.");
		if(obj==null) 
			return false; 
			
		//s1.equals(s1)
		if(this == obj){
			return true;
		}
		
		//s1.equals(s2)
		if (obj instanceof Student){
			return this.getId() == ((Student)obj).getId() && this.name.equals(((Student)obj).name);
		}
		return false;
	}
	
	@Override
	public String toString(){		
		return this.name;
	}
	/*
	@Override
	public int hashCode(){
		return this.id;
	}
	*/
}
