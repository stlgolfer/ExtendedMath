package xyz.amtstl.extendedmath.functions;

import xyz.amtstl.extendedmath.shapes.ThreeDimShape;

public class Area3D {
	
	// area of a 3d shape
	public static float findArea3D(ThreeDimShape shape) {
		return shape.getLength()*shape.getHeight()*shape.getLength();
	}
	
	public static float findArea3D(int l, int w, int h) {
		return l*w*h;
	}
}