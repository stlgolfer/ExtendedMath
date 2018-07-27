package xyz.amtstl.extendedmath.http;

public class NoSearchesFound extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NoSearchesFound(String regex) {
		super("No searches found for regex: " + regex);
	}
}