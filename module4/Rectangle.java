package module4;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle() {
		super(4);
		length = 1;
		width =1;
	}
	
	public Rectangle(int sideLength) {
		super(4);
		length = sideLength;
		width = sideLength;
	}
	
	public Rectangle(int newLength, int newWidth) {
		super(4);
		length = newLength;
		width = newWidth;
	}
	
	public void setLength(int inputLength) {
		length = inputLength;
	}
	
	public void setWidth(int inputWidth) {
		width = inputWidth;
	}

	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getArea() {
		return width * length;
	}
	
	public int getPerimeter() {
		return (2*width) + (2*length);
	}
}
