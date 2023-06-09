package hw10Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("Shaila Khanum", 34, 'F', false);
		System.out.println("The Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nEmployee Sex: " + employee.getSex() + "\nand is US citizen? Ans: " + employee.isCitizen());

	}

}
