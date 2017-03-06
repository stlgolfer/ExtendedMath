package xyz.amtstl.extendedmath.shapes;

public class FlatShape {
	private static int length;
	private static int width;
	
	public FlatShape(int l, int w) {
		length = l;
		width = w;
	}
	
	public static int[] getDimensions() {
		int[] dims = new int[] {length, width};
		return dims;
	}
	
	public static int getLength() {
		return length;
	}
	
	public static int getWidth() {
		return width;
	}
}