import java.util.*;

class InvalidAgeException extends Exception {
	String msg;

	InvalidAgeException(String d_msg) {
		msg = d_msg;
	}
	public String toString() {
		return msg;
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void validAge() throws InvalidAgeException {
		InvalidAgeException obj = new InvalidAgeException("");
		int flag = 1;

		if(!(age > 1 && age < 120)) {
			if(!(name.startsWith("RAM"))) {
				obj = new InvalidAgeException("The age and name both are invalid");
				flag = 0;
			} else {
				obj = new InvalidAgeException("The age is invalid");
				flag = 0;
			}
		} else {
			if(!(name.startsWith("RAM"))) {
				obj = new InvalidAgeException("The name is invalid");
				flag = 0;
			}
		}
		if(flag == 0) {
			throw obj;
		} else {
			System.out.println("\n----- Entered Details -----");
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println("\nBoth are valid details");
		}
	}
}

class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n----- Custom Exception -----");
		System.out.println("\nEnter name for the person : ");
		String name = sc.nextLine();

		System.out.println("Enter age for the person : ");
		int age = sc.nextInt();
		
		try {
			Person object = new Person(name, age);
			object.validAge();
		} catch(InvalidAgeException e) {
			System.out.println("\nException catch : " + e);
		}
	}
}
