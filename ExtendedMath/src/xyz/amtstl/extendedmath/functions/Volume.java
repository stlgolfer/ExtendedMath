package xyz.amtstl.extendedmath.functions;

import xyz.amtstl.extendedmath.ExtendedMath;
import xyz.amtstl.extendedmath.shapes.Circle;
import xyz.amtstl.extendedmath.shapes.FlatShape;

public class Volume {
	public static float findVolume2D(int l, int w) {
		return l*w;
	}
	
	/**
	 * Finds the volume of a 2-d shape
	 * @param shape
	 * @return the volume of the shape
	 */
	public static float findVolume2D(FlatShape shape) {
		return shape.getLength()*shape.getWidth();
	}
	
	/**
	 * Finds the volume of a sphere
	 * @param r
	 * @return the volume of the sphere
	 */
	public static float findVolumeSphere(float r) {
		return (float)((4/3)*ExtendedMath.pi*(Math.pow(r, 3)));
	}
	
	/**
	 * 
	 * @param shape to be processed
	 * @return
	 */
	public static float findVolumeSphere(Circle shape) {
		return (float)((4/3)*ExtendedMath.pi*(Math.pow(shape.getRadius(), 3)));
	}
}