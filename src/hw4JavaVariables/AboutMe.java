package hw4JavaVariables;

public class AboutMe {
	// Variable are declared.
	public String name;
	public byte age;
	public short monthlysalary;
	public int yearlysalary;
	public long passportnumber;
	public float height;
	public double cgpa;
	public char asian;
	public boolean isjavafun;

	public AboutMe() { // Constructor declared.
		System.out.println("This is all about us");

	}

	// method Implemented
	public void aboutMe() {

		System.out.println("My name : " + name + "\nMy age: " + age + "\nMy monthly salary: " + monthlysalary
				+ "\nMy Yearly Salary: " + yearlysalary + "\nMy Passport Number: " + passportnumber + "\nMy CGPA: "
				+ cgpa + "\nAre you interestin in JAVA? : " + isjavafun + "\nMy height: " + height + "\nAsian : "
				+ asian);

	}

}
