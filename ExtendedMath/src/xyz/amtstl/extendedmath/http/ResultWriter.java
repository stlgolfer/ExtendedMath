package xyz.amtstl.extendedmath.http;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.*;

public class ResultWriter {
	public static void writeResult(HttpExchange e, int status, String string) {
		try {
			e.sendResponseHeaders(status, string.length());
			OutputStream s = e.getResponseBody();
			s.write(string.getBytes());
			s.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}