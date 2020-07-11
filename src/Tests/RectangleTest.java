package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import Entites.Rectangle;

class RectangleTest {
    
	
	Rectangle rec;
	
	@Test
	void testArea() {
		
		rec = new Rectangle();
		rec.height = 4.00;
		rec.width = 3.00;
		assertEquals(12.0, rec.area());
	}

	@Test
	void testPerimeter() {
		
		rec = new Rectangle();
		rec.height = 4.00;
		rec.width = 3.00;
		
		assertEquals(14.0, rec.perimeter());
	}

	@Test
	void testDiagonal() {
		
		rec = new Rectangle();
		rec.height = 4.00;
		rec.width = 3.00;
		
		assertEquals(5.0, rec.diagonal());
	}

}
