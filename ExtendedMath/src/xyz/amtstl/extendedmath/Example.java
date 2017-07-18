package xyz.amtstl.extendedmath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import xyz.amtstl.javatools.misc.IO;
import xyz.amtstl.javatools.misc.ListSearcher;
import xyz.amtstl.javatools.misc.NoSearchesFound;

public class Example {
	
	public static void main(String args[]) {
		List<String> test = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			test.add(s.nextLine());
		}
		
		IO.println("Enter regex for searching...");
		
		try {
			IO.println(ListSearcher.searchArray(test, s.nextLine()).getTerm());
		} catch (NoSearchesFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.close();
	}
}