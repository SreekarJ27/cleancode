package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class baseTest {
	 private static final double DELTA = 1e-15;
base r=new base(600.0,3.33,2.5);
base r1=new base(100.0, 2.0, 1.0);

	@Test
	public void test() {
		assertEquals(4995.00,r.si(),DELTA);
		assertEquals(51.20439634629827,r.ci(),DELTA);
	}

}
