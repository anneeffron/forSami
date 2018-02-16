import java.util.Date;
import java.util.Scanner;
//11.1
public class TestShape{

	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three sides: ");
		
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();input.nextLine();
		
		
		System.out.print("Please enter a color: ");
		String color = input.nextLine();
		
		System.out.print("Please indicate if the triangle is filled (true or false): ");
		boolean filled = input.nextBoolean();
		
		
		// TODO Auto-generated method stub

		Triangle triangle1 = new Triangle(num1, num2, num3, color, filled);
		System.out.println(triangle1);
		System.out.println("The area is " + triangle1.getArea());
		System.out.println("The perimeter is " + triangle1.getPerimeter());
		System.out.println("The color is " + triangle1.getColor());
		System.out.println("Is the triangle filled? " + triangle1.isFilled());
	}
}
	
class GeometricObject{
	public String color = "white";
	private boolean filled;
	private Date dateCreated=  new Date(); 
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	//Return color
	public String getColor() {
		return color;
	}
	//Set a new color
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}

class Triangle extends GeometricObject {
		double side1 = 1.0;
		double side2 = 1.0;
		double side3 = 1.0;
		
		public Triangle() {
		}
		
		public Triangle(double side1, double side2, double side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;	
		}
		
		public Triangle(double side1, double side2, double side3, String color, boolean filled) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			setColor(color);
			setFilled(filled);
		}
		

		double getArea() {
			double num = (this.side1 + this.side2 + this.side3) / 2;
			double area = Math.sqrt(num *(num -this.side1)*(num-this.side2)*(num-this.side3));
			return area;
		}
		
		double getPerimeter() {
			return (side1 + side2 + side3);
		}
		
		public String toString() {
		return "Triangle: side1 " + side1 + " side2= " + side2 + " side3= " + side3;
		}
		
}



