package xyz.amtstl.extendedmath.functions;

import xyz.amtstl.extendedmath.shapes.FlatShape;
import xyz.amtstl.extendedmath.shapes.ThreeDimShape;

public class Area2D {
	// area of a 2d shape
	public static float findArea2D(FlatShape shape) {
		return shape.getLength() * shape.getWidth();
	}
	
	public static float findArea2D(int l, int w) {
		return l*w;
	}
	
	// area of a triangle
	public static float findAreaTriangle(FlatShape shape) {
		return ((shape.getLength()*shape.getWidth())/2);
	}
	
	public static float findAreaTriangle(int b, int h) {
		return ((b*h)/2);
	}
	
	// area of a trapezoid
	/*public static float findAreaTrapezoid(ThreeDimShape shape) {
		return (shape.getLength() + shape.getWidth())*(shape.getHeight()/2);
	}*/
	
	public static float findAreaTrapezoid(float b1, float b2, float h) {
		return (b1 + b2)*(h/2);
	}
}