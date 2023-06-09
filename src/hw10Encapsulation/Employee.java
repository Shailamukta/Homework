package hw10Encapsulation;

public class Employee {
          private String name;
          private int age;
          private char sex;
          private boolean uscitizen;
          
          
		public Employee(String name, int age, char sex, boolean citizen) {
			super();
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.uscitizen = citizen;
		}


		public String getName() {
			return name;
		}


		public int getAge() {
			return age;
		}


		public char getSex() {
			return sex;
		}


		public boolean isCitizen() {
			return uscitizen;
		}


		public void setName(String name) {
			this.name = name;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public void setSex(char sex) {
			this.sex = sex;
		}


		public void setCitizen(boolean citizen) {
			this.uscitizen = citizen;
		}

	}


