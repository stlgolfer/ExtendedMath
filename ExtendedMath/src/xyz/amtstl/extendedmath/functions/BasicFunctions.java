package xyz.amtstl.extendedmath.functions;

public class BasicFunctions {
	public static float multiply(float[] nums) {
		float out = 1;
		
		for (float n : nums) {
			out *= n;
		}
		
		return out;
	}
	
	public static float divide(float[] nums) {
		float out = 1;
		
		for (float n : nums) {
			out /= n;
		}
		
		return 0;
	}
	
	public static float add(float[] nums) {
		float out = 0;
		
		for (float n : nums) {
			out += n;
		}
		
		return out;
	}
	
	public static float subtract(float[] nums) {
		float out = nums[0];
		
		for (float n : nums) {
			out = out - n;
		}
		
		return 0;
	}
	
	public static float pythagorize(int a, int b) {
		return (float)(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
	}
}