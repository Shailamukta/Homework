package hw10Abstraction;

/*We use two keywords for inheritance in regular class.One is extends and     another is implements.We use Implements keyword only when we inheritance a regular class with Interface class and extends keyword for inheritance with abstract class.
*/
/*A regular class can inheritance with other abstract class or a Interface Class or with other regular class using extends or Implements keyword only one time.
*/
public class ColumbiaUniversity extends MedicalSchool {
	// public abstract void chemistry();
	// A regular class doesn't contain abstract method.
	public void biology() {
		System.out.println(
				"A regular class in a method body only can contain non abstract method,constractor,variable and object");
	}

	public ColumbiaUniversity() {
		// we can create constructor in a regular class.

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
