package hw9Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("I am a non abstract method");
	}

	// yes,this is a default constructor below.
	public MedicalSchool() {

	}

}
