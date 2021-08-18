package com.gowtham.model;

public class Player {
	private int id;
	private String Name;
	private String Gender;
	private int Age;
	private String City;
	private String sportname;
	private long contact;
	
	public Player()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	public Player(int id, String name, String gender, int age, String city, String sportname, long contact) {
		super();
		this.id = id;
		Name = name;
		Gender = gender;
		Age = age;
		City = city;
		this.sportname = sportname;
		this.contact = contact;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getSportname() {
		return sportname;
	}

	public void setSportname(String sportname) {
		this.sportname = sportname;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + ", City=" + City
				+ ", sportname=" + sportname + ", contact=" + contact + "]";
	}
}
