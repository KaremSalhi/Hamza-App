package tom;

import junit.framework.TestCase;

public class Testcalopr extends TestCase {
	
	private Calopr c;

	protected void setUp() throws Exception {
		super.setUp();
		c= new Calopr();
	}
	
	public void testsomme() {
		assertTrue(c.somme(2, 4)==6);
	}
	
	public void testproduit() {
		assertTrue(c.produit(2, 4)==8);
	}

}
