/**
 *  Static data taken from Experiment.
 */

/**
 * @author Studencik
 *
 */
public final class Experiment {
	public static final int COUNT = 10;
	public static final double HEIGHT = 1.5;
	public static final double[] TIMES = { 3.34, 4.83, 5.03 };
	
	private Experiment() {
	}
	
	public static String getString() {
		StringBuilder sb = new StringBuilder(256);
		sb.append("Experiment values.\n");
		sb.append("Height count: " + COUNT + " x " + HEIGHT + "[m]\n");
		if (TIMES != null) {
			sb.append("Time measurements: " + TIMES.length + "\n");
			sb.append("   { ");
			for (double i : TIMES)
				sb.append(i + "[s] ");
			sb.append("}\n");
		} else {
			sb.append("TimeMeasurements not initialized: SKIP\n");
		}
		
		return sb.toString();
	}

}
