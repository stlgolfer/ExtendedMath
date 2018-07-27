package xyz.amtstl.extendedmath.http;

import java.util.ArrayList;
import java.util.List;

/**
 * ListSearcher - a class that finds the best choice for a specified regex
 * @author Alex
 * @since 7/17/17
 */
public class ListSearcher {
	
	/**
	 * Searches an array
	 * @param inputArray the array to be searched
	 * @param regex the regex that needs to found in the array
	 * @return the best choice from the regex
	 * @throws NoSearchesFound 
	 */
	public static SearchResult searchArray(List<String> inputArray, String regex) throws NoSearchesFound {
		List<SearchResult> matches = new ArrayList<SearchResult>();
		
		for (int i = 0; i < inputArray.size(); i++) {
			if (inputArray.get(i).contains(regex)) {
				String chars = inputArray.get(i).replaceAll(regex, "");
				matches.add(new SearchResult(chars.length(), inputArray.get(i)));
			}
		}
		
		int minNumber = 100;
		
		/* Reorganize the matches according to value */
		for (int e = 0; e < matches.size(); e++) {
			if (matches.get(e).getMatchValue() < minNumber) {
				minNumber = matches.get(e).getMatchValue();
			}
		}
		
		for (SearchResult m : matches) {
			if (m.getMatchValue() == minNumber) {
				return m;
			}
		}
		
		throw new NoSearchesFound(regex);
	}
}