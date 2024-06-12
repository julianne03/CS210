package week9;

class Bird extends Pet {
	private double weight;
	private String SSNnumber;
	
	public void setWeight(double newWeight) {
		weight = newWeight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String speak() {
		return "Chirp! Chirp!";
	}
}
