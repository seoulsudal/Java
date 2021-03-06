package com.junit;

import java.util.Calendar;

public class DateUtill {

	public static String getCurTimeAs8Digit() {
		StringBuffer sb = new StringBuffer();
		Calendar cal = Calendar.getInstance();
		
		sb.append(cal.get(Calendar.YEAR));
		sb.append(String.format("%02d", cal.get(Calendar.MONTH)+1));
		sb.append(String.format("%02d",	cal.get(Calendar.DATE)));
		
		return sb.toString();
	}
}
