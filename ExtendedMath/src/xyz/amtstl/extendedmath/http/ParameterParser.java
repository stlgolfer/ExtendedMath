package xyz.amtstl.extendedmath.http;

import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.HttpExchange;

public class ParameterParser {
	private String query = "";
	private HttpExchange exchange;
	
	public ParameterParser(HttpExchange e, String q) {
		this.query = q;
		this.exchange = e;
	}
	
	public String getParam(String param) {
		try {
			SearchResult sr = ListSearcher.searchArray(this.parseGET(this.query), param);
			
			String result = sr.getTerm().replaceAll(param + "=", "");
			
			return result;
		} catch (NoSearchesFound e) {
			ResultWriter.writeResult(this.exchange, 200, "err: invalid parameters");
		}
		
		return null;
	}
	
	private List<String> parseGET(String arr) {
		String[] temp = arr.split("&");
		
		List<String> out = new ArrayList<String>();
		
		for (String s : temp) {
			out.add(s);
		}
		
		return out;
	}
}