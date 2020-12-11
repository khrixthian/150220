package git150220;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testgit150220 {
	@Test
	public void testtriple() {
		fdhs aux = new fdhs();
		int x= 3;
		int resultado = aux.triple(x);
		int resulesperado = 27;
		
		assertEquals(resultado, resulesperado);
	}
	
	@Test
	public void testdoble() {
		fdhs aux = new fdhs();
		int x= 3;
		int resultado = aux.doble(x);
		int resulesperado = 9;
		
		assertEquals(resultado, resulesperado);
	}

}
