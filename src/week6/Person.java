package week6;

public class Person {
	
	private String name;
	private String phoneNumber;
	private String birthDate;
	private String jerseyNumber;
	
	public Person(String name, String phoneNumber, String birthDate, String jerseyNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(String jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	

}
