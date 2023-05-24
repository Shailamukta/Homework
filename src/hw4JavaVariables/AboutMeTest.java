package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe shaila = new AboutMe();// constructor in initialized

		shaila.name = "Shaila"; // Variable initialized
		shaila.age = 33;
		shaila.monthlysalary = 30000;
		shaila.yearlysalary = 23422454;
		shaila.passportnumber = 377789999l;
		shaila.height = 5.00f;
		shaila.cgpa = 4.75;
		shaila.asian = 'Y';
		shaila.isjavafun = true;
		shaila.aboutMe(); // method initialized

		System.out.println("\n......\n");
		AboutMe Alex = new AboutMe();

		Alex.name = "Alex";
		Alex.age = 34;
		Alex.monthlysalary = 25000;
		Alex.yearlysalary = 2342454;
		Alex.passportnumber = 37787789999l;
		Alex.height = 5.04f;
		Alex.cgpa = 4.95;
		Alex.asian = 'N';
		Alex.isjavafun = false;
		Alex.aboutMe();

	}

}
