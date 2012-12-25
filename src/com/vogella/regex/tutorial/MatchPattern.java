package com.vogella.regex.tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Pattern NAMES_PATTERN = Pattern.compile("\\{([^/]+?)\\}");
		//final Pattern NAMES_PATTERN = Pattern.compile("\Q/\E(.*)");
		
		String[] paths = {"/{resourceName}", "/opportunities/{optyId}/attachments/{attachmentId}", "/resources"};
		for(String path:paths) {
			Matcher matcher = NAMES_PATTERN.matcher(path);
			if(matcher.matches()) {
				System.out.println(path + " Matches regex");
			}
			else {
				System.out.println(path + " doesn't matches the regex");
			}
		}
	}

}
