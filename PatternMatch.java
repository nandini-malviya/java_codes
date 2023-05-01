package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("agent \\d\\d\\d");
		Matcher matcher= pattern.matcher("agent 007");
		boolean found = matcher.find();
		System.out.println("Found :" + found);
		System.out.println("Match ");
	}

}
