package triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
	@Test
	public void testTriangleField() {
		Triangle tf = new Triangle(2.5, 3);
		double expectedField = 3.75d;
		double delta = 1e-3;

		double actualField = tf.triangleField();

		assertEquals(expectedField, actualField, delta);
	}
}
