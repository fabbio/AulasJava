package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Entites.Employee;

class EmployeeTest {

	@Test
	void testIncreaseSalary() {
		
		Employee emp = new Employee();
		
		emp.grossSalary = 15000.00;
		emp.tax = 1000.00;
		emp.increaseSalary(20.0);
		
		assertEquals(17000.00,emp.netSalary());
		
		


	}

}
