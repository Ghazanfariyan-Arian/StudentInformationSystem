package com.agh.studentapp;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String major;
	
	// Setters
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	//Getters
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getMajor()
	{
		return major;
	}
}
