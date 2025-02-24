package module3;

public class automobile {
	private String model;
	private String brand;
	private int year;

	public automobile(String make, String brand, int year) {
		model = make;
		this.brand = brand;
		this.year = year;
	}

	public boolean equals(Object o) {
		if (o instanceof automobile && 
				model == ((automobile) o).model &&
				brand == ((automobile) o).brand &&
				year == ((automobile) o).year) {
			return true;
		}
		else { return false;}
	}
	
	public String compareTo(Object i) {
		if (i instanceof automobile) {
			return "The first automobile is a "+model+" from the company "+brand+" released in "+year+", while the second car is a "+((automobile) i).model+" from the company "+((automobile) i).brand+" realeased in "+((automobile) i).year+".";
		}
		else {return "not the same objects";}
	}
	
	public void honk() {
		System.out.println("honk??");
	}

	public String toString(){
		return "This is a "+model+" is a "+this.brand+" from "+this.year;
	}
}
