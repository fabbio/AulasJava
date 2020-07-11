package Entites;

public class EmployeerList {
	
	private int id;
	private String name;
	private double salary;
	
	public EmployeerList(int id, String name, double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public double increasesSalary (double percent) {
		
		this.salary = this.salary*(1 + percent/100);
		
		return this.salary;
		
	}
	
	
}
