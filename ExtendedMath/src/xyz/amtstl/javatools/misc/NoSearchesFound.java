package xyz.amtstl.javatools.misc;

public class NoSearchesFound extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NoSearchesFound(String regex) {
		super("No searches found for regex: " + regex);
	}
}