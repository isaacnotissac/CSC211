package module4;

public class Tester {

	public static void main(String[] args) {
		Shape s = new Shape();
		Shape s1 = new Shape(1);
		Circle c = new Circle();
		Circle c1 = new Circle(5);
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(3);
		Rectangle r2 = new Rectangle(10, 5);
		
		System.out.println(s.getSides());
		System.out.println(s1.getSides());
		System.out.println("");
		
		System.out.println(c.getRadius());
		System.out.println(c.getDiameter());
		System.out.println(c.getCircumference());
		System.out.println(c.getArea());
		System.out.println("");
		
		System.out.println(c1.getRadius());
		System.out.println(c1.getDiameter());
		System.out.println(c1.getCircumference());
		System.out.println(c1.getArea());
		System.out.println("");
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println("");
		
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println("");
		
		System.out.println(r2.getLength());
		System.out.println(r2.getWidth());
		System.out.println(r2.getArea());
		System.out.println(r2.getPerimeter());
		System.out.println("");
		
		System.out.println(c.getSides());
		System.out.println(c1.getSides());
		System.out.println(r.getSides());
		System.out.println(r1.getSides());
		System.out.println(r2.getSides());
		

	}

}
