package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		// default constructor declared
		System.out.println("This is from the default Constructor of Computer class.");
	}

	public Computer(String brand, String model, String operatingsystem, int price, char grade, boolean madeInUSA) {

		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + "Model: " + model + "Operating system: " + ", Price: " + price
				+ ", Grade: " + grade + " ,Made in the USA? " + madeInUSA);

	}
}
