/**
 * 
 */

/**
 * @author Studencik
 *
 */

final class MathMiniUtils {

	public static double getMeanArithmetic(double[] tab) {
		double sum = 0d;
		for (double val : tab) {
			sum += val;
		}
		double mean = sum / tab.length;
		return mean;
	}

	public static double calcGravityFromFallTime(double fallTime, double height) {
		// height = grav * fallTime^2 * 0.5 ;
		return height / (fallTime * fallTime) * 2;
	}

}
