class Rectangle {
	int height;
	int width;

	Rectangle() {
		height = 10;
		width = 10;
	}
	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	Rectangle(Rectangle obj) {
		height = obj.height;
		width = obj.width;
	}
	void area() {
		System.out.println("The Height of Rectangle : " + height);
		System.out.println("The width of Rectangle : " + width);
		System.out.println("\nThe Area of Rectangle : " + (height * width));
	}
}
class Area {
	int a;
	int b;
	void sum(int a, int b) {
		System.out.println("\nArea of Rectangle L = " + a + " and B = " + b + " is : " + (a * b));
	}
	void sum(int a, double b) {
		System.out.println("Area of Rectangle L = " + a + " and B = " + b + " is : " + (a * b));
	}
	void sum(double a, double b) {
		System.out.println("Area of Rectangle L = " + a + " and B = " + b + " is : " + (a * b));
	}
}

class ConstructorOverloading {
	public static void main(String[] args) {

		System.out.println("\n-----Overloading Constructor-----");
		System.out.println("\nObject1 with Default Constructor.....\n");
		Rectangle obj1 = new Rectangle();
		obj1.area();
		
		System.out.println("\n->Object2 with Parameterized Constructor\n");
		Rectangle obj2 = new Rectangle(10, 20);
		obj2.area();

		System.out.println("\n->Object3 with object2 in formal argument\n");
		Rectangle obj3 = new Rectangle(obj2);
		obj3.area();

		System.out.println("\n-----Method Overloading-----");
		Area obj4 = new Area();
		obj4.sum(10, 20);
		obj4.sum(10, 20.98);
		obj4.sum(10.20, 9.80);
	}
}
