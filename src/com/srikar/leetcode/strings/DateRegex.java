package com.srikar.leetcode.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateRegex {

	public static void main(String[] args) {
		String date = "India";

		Pattern pattern1 = Pattern.compile("\\d{4}\\-[\\d{2}\\-]{5}\\ [\\d{2}\\:]{8}\\.\\d*");
		Pattern pattern = Pattern.compile("\\.\\d*");
		Matcher match = pattern.matcher(date);
		Matcher match1 = pattern1.matcher(date);

		String s = "";
		if(match1.find()) {
			if (match.find()) {
				s = match.group();
				s = date.replace(s, "");
			}
		} else {
			s = date;
		}
		
		
		System.out.println(s);
	}
}
