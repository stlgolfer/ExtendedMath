package xyz.amtstl.extendedmath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import xyz.amtstl.javatools.misc.IO;
import xyz.amtstl.javatools.misc.ListSearcher;

public class Example {
	
	public static void main(String args[]) {
		List<String> test = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			test.add(s.nextLine());
		}
		
		IO.println("Enter regex for searching...");
		
		IO.println(ListSearcher.searchArray(test, s.nextLine()).getTerm());
		
		s.close();
	}
}