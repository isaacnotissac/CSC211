package module3;

public class JunkCar extends automobile{
	private int yearsJunked;
	private boolean crashed;
	
	public JunkCar(String make, String company, int year, int junkedXYears, boolean ifCrashed) {
		super(make, company, year);
		yearsJunked = junkedXYears;
		crashed = ifCrashed;
	}
	@Override public boolean equals(Object o) {
		if (o instanceof JunkCar &&
			super.equals(o) &&
			yearsJunked == ((JunkCar) o).yearsJunked &&
			crashed == ((JunkCar) o).crashed) {
			return true;
		}
		else {return false;}
	}
	
	@Override public String compareTo(Object o) {
		if (o instanceof JunkCar) {
			if (crashed) {
				return super.compareTo(o) + " It was junked "+yearsJunked+" ago and has been in an accident";
			}
			else {
				return super.compareTo(o) + " It was junked "+yearsJunked+" ago and has not been in an accident";
			}
		}
		else {return "not same object";}
		}
	@Override public String toString() {
		if (crashed) {
			return super.toString()+", was junked "+yearsJunked+" and has been in a crash";
		}
		else { return super.toString()+", was junked "+yearsJunked+" and has not been in a crash";}
	
	}
	

}
