/**
 * 
 */

/**
 * @author Studencik
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	static PhysController physController;
	static Model model;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		model = new Model();
		physController = new PhysController(model);
		PhysController.calcGravity();
		System.out.println(Experiment.getString());
		System.out.println(model.toString());
	}

}
