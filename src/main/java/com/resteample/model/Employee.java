package com.resteample.model;


public class Employee {
    String name; 
    String password;
    int id ;
    
	public Employee(String name, String password, int id) {
		super();
		this.name = name;
		this.password = password;
		this.id = id;
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
    public String getpassword() {
       return password;
    }
    public void setpassword(String password) {
      this.password = password;
    }
   
}