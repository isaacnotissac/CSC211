package module3;

public class SportsCar extends automobile{
	private int horsepower;
	public SportsCar(String make, String brand, int year, int hp) {
		super(make, brand, year);
		horsepower = hp;
	}
	
	@Override public boolean equals(Object o) {
		if (o instanceof SportsCar &&
			super.equals(o) &&
			horsepower == ((SportsCar) o).horsepower) {
			return true;
		}
		else {return false;}
	}
	
	@Override public String compareTo(Object o) {
		if (o instanceof SportsCar) {
			return super.compareTo(o) + " It has "+horsepower+" horsepower";
		}
		else {return "not same object";}
		}
	
	@Override public String toString(){
		return super.toString()+" it has "+horsepower+" horsepower";
	}

}