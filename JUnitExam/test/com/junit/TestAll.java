package com.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("All test");
		suite.addTest(new TestSuite(TestDateUtill.class));
		suite.addTestSuite(TestFileUtill.class);
		suite.addTestSuite(TestAssert.class);
		return suite;
	}
}
