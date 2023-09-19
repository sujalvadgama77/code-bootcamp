class Square1 {
	int a;

	Square1() {
		a = 0;
	}
	Square1(int a) {
		this.a = a;
	}
	void showSquare1() {
		System.out.println("Lenght of a from class Square1 is : " + a);
	}
}

class Square2 extends Square1{
	int b;

	Square2() {
		b = 0;
	}
	Square2(int b) {
		this.b = b;
	}
	void showSquare2() {
		System.out.println("Length of b from class Square2 is : " + b);
	}
}

class Inheritance {
	public static void main(String[] args) {
		System.out.println("\n----- Inheritance -----");
		System.out.println("\nLength of Square1 set to 10");
		Square1 objA = new Square1(10);
		System.out.println("Length of Square2 set to 20");
		Square2 objB = new Square2(20);

		System.out.println("\nBy object of subclass B showSquare1() from class A");
		objB.showSquare1();
		System.out.println("\nBy object of subclass B showSquare2() from class B");
		objB.showSquare2();
	}
}

