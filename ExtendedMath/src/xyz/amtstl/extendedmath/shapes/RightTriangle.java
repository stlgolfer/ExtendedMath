package xyz.amtstl.extendedmath.shapes;

public class RightTriangle {
	private static float aSide;
	private static float bSide;
	private static float cSide;
	
	public RightTriangle(int a, int b, int c) {
		aSide = a;
	}
	
	public static float findAngleA() {
		return (float)Math.tan((bSide/aSide));
	}
}