package Entites;

public class Aluno {
	
	public String name;
	public double nota01;
	public double nota02;
	public double nota03;
	
	
	public double somaNotas () {
		
		double somaNotas = this.nota01 + this.nota02 + this.nota03;		
		return somaNotas;
		
	}
	
	public void resultado( double somanotas) {
		
		if (somanotas >= 60.00) {
			
			System.out.println("Student PASS : "+ somanotas);
		}
		else {
			
			double falta = 60.00 - somanotas;
			System.out.println("Stundent FAILED : " + somanotas);
			System.out.println("The Student needs : " + falta + " to PASS");
		}
	}
	
	public String toString() {
		
		return name + "- Nota 01: "+nota01 + "- Nota 02: " + nota02 + "- Nota 03: "+ nota03 ;
	}

}
