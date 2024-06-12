package week3;

import java.util.Scanner;

public class ResumeBuilder {
	
	private static String getName(Scanner scanner) {
		System.out.println("Please enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName = scanner.nextLine();
		return firstName + " " + lastName;
	}
	
	private static String getContactInfo(Scanner scanner) {
		System.out.println("Please enter your phone number: ");
		String phoneNumber = scanner.nextLine();
		return phoneNumber;
	}
	
	private static String getEducation(Scanner scanner) {
		System.out.println("Please enter your education school: ");
		String schoolName = scanner.nextLine();
		System.out.println("Please enter your major: ");
		String major = scanner.nextLine();
		System.out.println("Please enter your graduation year: ");
		String graduationYear = scanner.nextLine();
		return "major: " + major + " school name: " + schoolName + " graduation year: " + graduationYear;
	}
	
	private static String getWorkExperience(Scanner scanner) {
		System.out.println("Please enter your most recent work experience: ");
		String workExperience = scanner.nextLine();
		return workExperience;
	}
	
	private static String getSkills(Scanner scanner) {
		System.out.println("Please enter your skills: ");
		String skills = scanner.nextLine();
		return skills;
	}
	
	private static void buildResume(String fullName, String contactInfo, String education, String workExperience, String skills) {
		System.out.println();
		System.out.println("----------RESUME-----------");
		System.out.println("name: " + fullName);
		System.out.println("contact info: " + contactInfo);
		System.out.println("education: " + education);
		System.out.println("work experience: " + workExperience);
		System.out.println("skills: " + skills);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String fullName = getName(scanner);
		String contactInfo = getContactInfo(scanner);
		String education = getEducation(scanner);
		String workExperience = getWorkExperience(scanner);
		String skills = getSkills(scanner);
		
		buildResume(fullName, contactInfo, education, workExperience, skills);
	}
}
