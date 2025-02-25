package module4;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		radius = 1;
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public void setRadius(double inputRadius) {
		radius = inputRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	
	public double getCircumference() {
		return (2) * (Math.PI)*radius;
	}
	
	public double getArea() {
		return (Math.PI) * (radius * radius);
	}

}
