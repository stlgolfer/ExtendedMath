package xyz.amtstl.extendedmath.shapes;

import xyz.amtstl.extendedmath.ExtendedMath;

public class Circle {
	private static float radius;
	private static float circumference;
	private static float area;
	
	public Circle(float r) {
		radius = r;
		circumference = 2*ExtendedMath.pi*radius;
		area = (float)(ExtendedMath.pi*(Math.pow(radius, 2)));
	}
	
	public static float getRadius() {
		return radius;
	}
	
	public static float getCircumference() {
		return circumference;
	}
	
	public static float getArea() {
		return area;
	}
}