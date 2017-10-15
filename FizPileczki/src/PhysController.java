/**
 * 
 */

/**
 * @author Studencik
 *
 */
public class PhysController {
	
	static Model model;
	
	PhysController(Model model){
		PhysController.model = model;
	}

	public static void calcGravity() {
		double fallTime = MathMiniUtils.getMeanArithmetic(Experiment.TIMES) / Experiment.COUNT ;
		double height = Experiment.HEIGHT;
		double val = MathMiniUtils.calcGravityFromFallTime(fallTime, height);
		model.setGravity(val);
		
	}
	
	public static double getGravity() {
		return model.getGravity() ;
	}
	

}
