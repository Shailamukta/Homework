package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {
		int age = 18;

		if (age == 18) {
			System.out.println("\"I am a Voter\"");
		} else if (age < 18) {
			System.out.println("I am not a Voter" + age);
		} else if (age > 18) {
			System.out.println("I am a Voter from age" + age);
		} else {
			System.out.println("Please add a valid age.");
		}

	}

}
