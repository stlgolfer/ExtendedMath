package xyz.amtstl.extendedmath.shapes;

public class ThreeDimShape {
	private static int length;
	private static int width;
	private static int height;
	
	public ThreeDimShape(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	
	public static int[] getDimensions() {
		int[] dims = new int[] {length, width, height};
		return dims;
	}
	
	public static int getLength() {
		return length;
	}
	
	public static int getWidth() {
		return width;
	}
	
	public static int getHeight() {
		return height;
	}
}