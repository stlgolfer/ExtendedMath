package xyz.amtstl.extendedmath.functions;

public class Iterators {
	// array iterators
	public static String iterateFloatArray(float[] arr) {
		String out = "";
		
		for (float i : arr) {
			out += String.valueOf(i) + "\n";
		}
		
		return out;
	}
	
	public static String iterateIntArray(int[] arr) {
		String out = "";
		
		for (float i : arr) {
			out += String.valueOf(i) + "\n";
		}
		
		return out;
	}
	
	public static String iterateBoolArray(boolean[] arr) {
		String out = "";
		
		for (boolean i : arr) {
			out += String.valueOf(i) + "\n";
		}
		
		return out;
	}
	
	public static String iterateDoubleArray(double[] arr) {
		String out = "";
		
		for (double i : arr) {
			out += String.valueOf(i) + "\n";
		}
		
		return out;
	}
	
	public static String iterateStringArray(String[] arr) {
		String out = "";
		
		for (String i : arr) {
			out += String.valueOf(i) + "\n";
		}
		
		return out;
	}
	
	// matrix iterators
	public static String iterateFloatMatrix(float[][] arr) {
		String out = "";
		
		for (int row=0; row < arr.length; row++)
		{
		    for (int col=0; col < arr[row].length; col++)
		    {
		    	out += arr[row][col] + ", ";
		    }
		    out += "\n";
		}
		
		return out;
	}
	
	public static String iterateIntMatrix(int[][] arr) {
		String out = "";
		
		for (int row=0; row < arr.length; row++)
		{
		    for (int col=0; col < arr[row].length; col++)
		    {
		    	out += arr[row][col] + ", ";
		    }
		    out += "\n";
		}
		
		return out;
	}
	
	public static String iterateBoolMatrix(boolean[][] arr) {
		String out = "";
		
		for (int row=0; row < arr.length; row++)
		{
		    for (int col=0; col < arr[row].length; col++)
		    {
		    	out += arr[row][col] + ", ";
		    }
		    out += "\n";
		}
		
		return out;
	}
	
	public static String iterateDoubleMatrix(double[][] arr) {
		String out = "";
		
		for (int row=0; row < arr.length; row++)
		{
		    for (int col=0; col < arr[row].length; col++)
		    {
		    	out += arr[row][col] + ", ";
		    }
		    out += "\n";
		}
		
		return out;
	}
	
	public static String iterateStringMatrix(String[][] arr) {
		String out = "";
		
		for (int row=0; row < arr.length; row++)
		{
		    for (int col=0; col < arr[row].length; col++)
		    {
		    	out += arr[row][col] + ", ";
		    }
		    out += "\n";
		}
		
		return out;
	}
}