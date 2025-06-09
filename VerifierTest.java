import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class VerifierTest {

	private Verifier evenVal;
	private Verifier oddVal;
	
	/** Fixture initialization (common initialization for all tests). **/
	@Before public void setUp() {
		evenVal = new Verifier(4);
		oddVal = new Verifier(5);
	}


	/** Test isEven for odd numbers. **/
	@Test public void testIsEvenTrue() {
        assertTrue("4 should be even.", evenVal.isEven());
    }

	/** Test isEven for odd numbers. **/
	@Test public void testIsEvenFalse() {
        assertFalse("5 should not be even.", oddVal.isEven());
    }

	/** To test if getPower produces correct power. **/
	@Test public void testGetPower() {
		Verifier verifier = new Verifier(3);
		assertEquals("3 to the power of 4 should be 81.", 81, verifier.getPower(4));
		assertEquals("3 to the power of 3 should not be 25.", 25, verifier.getPower(3));
	}
}
