package xyz.amtstl.javatools.misc;

/**
 * SearchResult data type
 * @author Alex
 *
 */
public class SearchResult {
	private int matchValue;
	private String value;
	
	public SearchResult(int m, String v) {
		this.matchValue = m;
		this.value = v;
	}
	
	public int getMatchValue() {
		return this.matchValue;
	}
	
	public String getTerm() {
		return this.value;
	}
}