package com.junit;

import java.io.File;

import junit.framework.TestCase;

public class TestFileUtill extends TestCase {

	public void testScenario1() {
		File file = FileUtil.getNoteFile();
		assertNotNull(file);
		
		String today = DateUtill.getCurTimeAs8Digit();
		assertNotNull(today);
		assertEquals("20210908", today);
		
		String[] fileNames = FileUtil.listFiles(FileUtil.PATH, FileUtil.PREFIX);
		
		assertNotNull(fileNames);
		for(String fileName : fileNames) {
			System.out.println("File name : " + fileName);
		}
	}
}
