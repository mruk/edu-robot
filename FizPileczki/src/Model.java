/**
 * 
 */

/**
 * @author Studencik
 *
 */
public class Model {

	private double gravity;

	Model() {
		gravity = 0;
	}

	public void setGravity(double val) {
		gravity = val;
	}

	public double getGravity() {
		return gravity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(256);
		sb.append("Model values.\n");
		sb.append("Gravity: " + String.format("%.2f", gravity) + " [m/s]");

		return sb.toString();
	}
}
