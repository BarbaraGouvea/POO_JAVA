package anagrama;
import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAnagrama {

	@Test
	public void test() {
		
		assertTrue(Anagrama.saoAnagramas("",""));
		assertTrue(Anagrama.saoAnagramas(" ",""));
		assertTrue(Anagrama.saoAnagramas("a","a "));
		assertFalse(Anagrama.saoAnagramas("a ","b"));
		assertTrue(Anagrama.saoAnagramas("ab","ab"));
		assertTrue(Anagrama.saoAnagramas("ab","a b"));
		assertTrue(Anagrama.saoAnagramas("b a","a b"));
		assertTrue(Anagrama.saoAnagramas("ab", "ba"));
		assertFalse(Anagrama.saoAnagramas("ba", "a"));
		
	}

}
