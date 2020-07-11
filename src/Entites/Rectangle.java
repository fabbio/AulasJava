package Entites;

public class Rectangle {
	
	public double width = 0;
	public double height = 0;
	
	public double area() {
		
		double area = this.width * this.height;
		return area;
		
	}
	
	public double perimeter() {
		
		double perimeter = 2 * (this.width + this.height);
		
		return perimeter; 
	}
	
	public double diagonal() {
		
		double diagonal = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2) );
		return diagonal;
	}


}
