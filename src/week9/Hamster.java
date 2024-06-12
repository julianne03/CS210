package week9;

class Hamster extends Pet {
	private String coatColor;
	
	public void setCoatColor(String newCoatColor) {
		coatColor = newCoatColor;
	}
	
	public String getCoatColor() {
		return coatColor;
	}
	
	public String speak() {
		return "Squeak! Squeak!";
	}
}
