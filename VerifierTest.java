import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ValidatorTest {

	private Validator evenVal;
	private Validator oddVal;
	
	/** Fixture initialization (common initialization for all tests). **/
	@Before public void setUp() {
		evenVal = new Validator(4);
		oddVal = new Validator(5);
	}


	/** Test isEven for odd numbers. **/
	@Test public void testIsEvenTrue() {
        assertTrue("4 should be even.", evenVal.isEven());
    }

	/** Test isEven for odd numbers. **/
	@Test public void testIsEvenFalse() {
        assertFalse("5 should not be even.", validatorOdd.isEven());
    }

	/** To test if getPower produces correct power. **/
	@Test public void testGetPower() {
		Validator validator = new Validator(3);
		assertEquals("3 to the power of 4 should be 81.", 81, validator.getPower(4));
		assertEquals("3 to the power of 3 should not be 25.", 25, validator.getPower(3));
	}
}
