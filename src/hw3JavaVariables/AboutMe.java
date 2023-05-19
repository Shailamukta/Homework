package hw3JavaVariables;

public class AboutMe {

	public String name = "Shaila Khanum Mukta"; // variable initialized
	public byte age = 33;
	public short monthlysalary = 30000;
	public int yearlysalary; // variable declared
	public long passportnumber = 377789999l;
	public float height = 5.00f;
	public double cgpa = 4.75;
	public char asian = 'Y'; //
	public boolean isjavafun = true; //

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println("My name : " + aboutMe.name + "\nMy age: " + aboutMe.age + "\nMy height: " + aboutMe.height
				+ "\nAsian : " + aboutMe.asian + " , \nYearly salary: " + aboutMe.yearlysalary);

	}

}
