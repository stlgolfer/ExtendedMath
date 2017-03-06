package xyz.amtstl.extendedmath;

import xyz.amtstl.extendedmath.functions.BasicFunctions;
import xyz.amtstl.extendedmath.functions.Iterators;
import xyz.amtstl.extendedmath.shapes.Circle;
import xyz.amtstl.extendedmath.shapes.FlatShape;
import xyz.amtstl.extendedmath.shapes.RightTriangle;
import xyz.amtstl.extendedmath.shapes.ThreeDimShape;
import xyz.amtstl.extendedmath.shapes.Trapezoid;
import xyz.amtstl.extendedmath.shapes.Triangle;

@SuppressWarnings("unused")
public class Example {
	
	public static void main(String args[]) {
		float[][] mat = new float[][] {
			{4,6},
			{7, 8}
		};
		
		IO.println(Iterators.iterateFloatMatrix(mat));
	}
}