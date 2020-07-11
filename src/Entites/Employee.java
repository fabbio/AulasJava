package Entites;

public class Employee {
	
	public String name;
	public double grossSalary ;
	public double tax;
	
	
	public double netSalary() {
		
		double salary = grossSalary - tax;
		
		return salary;
		
	}
	
	public void increaseSalary(double per) {
		
		grossSalary *= (1 + (per/100));
		
		
	}
	
	public String toString() {
		
		return name + ", $ " + String.format("%.2f", netSalary());
		
	}
	

}
