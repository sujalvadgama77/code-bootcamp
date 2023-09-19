abstract class One {
	final int charge = 10;
	public abstract void printBankName();
	final public void reserve() {
		System.out.println("Reserve Bank has 1000 crore in reserve");
	}
}

final class BankA extends One {
	public void printBankName() {
		System.out.println("\nThe Bank name is : Bank of Baroda");
		System.out.println("Charge for transaction is : " + charge);
	}
}

class BankB extends One {
	public void printBankName() {
		System.out.println("\nThe Bank name is : Panjab National Bank");
		System.out.println("Charge for transaction is : " + charge);
	}
}

class Keyword {
	public static void main(String[] args) {
		System.out.println("\n----- Use Of Keywords -----");

		System.out.println("\nCharge set to 10 rupees which cannot be immutable by any class");
		System.out.println("Class BankA is set as final, it can not be inherit");
		System.out.println("Class BankA has reserve method as final, it can not be override");
		System.out.println("\nThe abstract method in class One is implement by class BankA & BankB");
		System.out.println("The abstract method in class One make class One abstract");	

		BankA obj1 = new BankA();
		obj1.printBankName();
		obj1.reserve();

		BankB obj2 = new BankB();
		obj2.printBankName();
		obj1.reserve();
	}
}
