package module4; 

public class Shape {
	private int sides;

	public Shape() {
		sides =0;
	}
	
	public Shape(int newSides) {
		sides = newSides;
	}
	
	public void setSides(int inputSides) {
		sides = inputSides;
	}
	
	public int getSides() {
		return sides;
	}

}
