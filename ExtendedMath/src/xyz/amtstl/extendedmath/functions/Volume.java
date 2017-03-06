package xyz.amtstl.extendedmath.functions;

import xyz.amtstl.extendedmath.ExtendedMath;
import xyz.amtstl.extendedmath.shapes.Circle;
import xyz.amtstl.extendedmath.shapes.FlatShape;

public class Volume {
	public static float findVolume2D(int l, int w) {
		return l*w;
	}

	public static float findVolume2D(FlatShape shape) {
		return shape.getLength()*shape.getWidth();
	}
	
	public static float findVolumeSphere(float r) {
		return (float)((4/3)*ExtendedMath.pi*(Math.pow(r, 3)));
	}
	
	public static float findVolumeSphere(Circle shape) {
		return (float)((4/3)*ExtendedMath.pi*(Math.pow(shape.getRadius(), 3)));
	}
}