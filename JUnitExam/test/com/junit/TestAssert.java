package com.junit;

import junit.framework.TestCase;

public class TestAssert extends TestCase {

	public void testAssert() {
		String today = DateUtill.getCurTimeAs8Digit();
		assertNotNull(today);
		assertEquals("20210908", today);
	}
}
