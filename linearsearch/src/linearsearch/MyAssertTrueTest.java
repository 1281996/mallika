package linearsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyAssertTrueTest {

	@Test
	public void test1() {
		LinearSearch ls= new LinearSearch();
		assertTrue(ls.searchEleFound(10));
	}
	
	

}
