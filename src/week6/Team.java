package week6;

import java.util.ArrayList;

public class Team {
	public ArrayList<Person> teamArray;
	private String teamName;
	private String coachName;
	private String conferenceName;

	
	public Team(String teamName, String coachName, String conferenceName) {
		this.teamName = teamName;
		this.coachName = coachName;
		this.conferenceName = conferenceName;
		teamArray = new ArrayList<Person>();
	}
	
	public ArrayList<Person> getTeamArray() {
		return teamArray;
	}

	public void setTeamArray(ArrayList<Person> teamArray) {
		this.teamArray = teamArray;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}

	public void addPerson(Person person) {
		teamArray.add(person);
	}

	public String findPerson(String name) {
		for (int i = 0; i < teamArray.size(); i++) {
			if (teamArray.get(i).getName() == name) {
				return teamArray.get(i).getName() + ", No. " + teamArray.get(i).getJerseyNumber();
			}
		}
		return null;
	}

	public void displayRoster() {
		System.out.println("---------" + this.teamName + "--------");
		for (int i = 0; i < this.getTeamArray().size(); i++) {
			Person member = this.getTeamArray().get(i);
			System.out.println(member.getName() + " / " + member.getPhoneNumber()
				+ " / " + member.getBirthDate() + " / No." + member.getJerseyNumber());
		}
		System.out.println("----------------------------------");
		System.out.println();

	}
	
	public static void main(String[] args) {
		Team seahawks = new Team("Seattle Seahawks", "Tim", "NFC");
		Person jack = new Person("Jack", "111-2222-3333", "12.12", "12");
		Person peter = new Person("Peter", "111-4444-5555", "3.13", "1");
		Person juli = new Person("Juli", "111-6666-7777", "4.5", "5");
		
		seahawks.addPerson(jack);
		seahawks.addPerson(peter);
		seahawks.addPerson(juli);
		
		String someone = seahawks.findPerson("Peter");
		System.out.println("----------------------------------");
		if (someone != null) System.out.println("We found " + someone + " in " + seahawks.teamName);
		System.out.println("----------------------------------");
		System.out.println();
		
		
		seahawks.displayRoster();
		
		Team kraken = new Team("Seattle Kraken", "Jay", "NHL");
		Person matty = new Person("Matty", "111-8888-9999", "5.8", "12");
		Person joey = new Person("Joey", "111-1212-3434", "7.9", "1");
		Person jayden = new Person("Jayden", "111-5656-7878", "9.1", "5");
		
		kraken.addPerson(matty);
		kraken.addPerson(joey);
		kraken.addPerson(jayden);
		
		kraken.displayRoster();
	}
}
