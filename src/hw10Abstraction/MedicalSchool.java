package hw10Abstraction;

/*We use two keywords for inheritance in abstract class.One is extends and     another is implements.We use Implements keyword only when we inheritance abstract class with Interface class and extends keyword for inheritance with abstract and with regular class.
 */
/*Abstract class can inheritance with other abstract class or a regular Class using extends keyword only one time.
 */

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("I am a non abstract method");
	}

	// yes,this is a default constructor below.
	public MedicalSchool() {

	}

}
