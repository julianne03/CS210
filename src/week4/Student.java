package week4;

/*
* Introduction to OOP with Java, McGraw-Hill
*
* Chapter 7 Exercise 15
*
*/
public class Student {
	private String name;
	private int age;
	private String address;

	public Student(String name, int age, String address) {
		// assign passed values to the data members
		// this. + variable -> memeber variables
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// in the final exam, there will be question asking about difference between getter and setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
