package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stId;
	public char Sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		// default Constructor declared
		System.out.println("This is from the default Constructor of the Student class.");

	}

	public Student(String stName, int stId, char sex, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stId = stId;
		Sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID:" + stId + ", Sex: " + sex + ", Grade: " + grade
				+ ", Java Programmer?Ans:" + isProgrammer);
	}
}
