class Length {
	int meter;
	int cm;
	int mm;

	Length(int milimeter) {
		meter = 0;
		cm = 0;
		mm = milimeter;
	}

	Length(int meter, int cm, int mm) {
		this.meter = meter;
		this.cm = cm;
		this.mm = mm;
	}

	int toMilimeter() {
		return ((this.meter * 1000) + (this.cm * 10) + (this.mm));
	}

	Length add(Length obj) {
		int newMilimeter = this.toMilimeter() + obj.toMilimeter();

		return new Length(0, 0, newMilimeter);
	}

	Length sub(Length obj) {
		int newMilimeter = this.toMilimeter() - obj.toMilimeter();

		return new Length(0, 0, newMilimeter);
	}

	Length mul(int factor) {
		int newMilimeter = this.toMilimeter() * factor;

		return new Length(0, 0, newMilimeter);
	}

	Length div(int factor) {
		int newMilimeter = this.toMilimeter() / factor;

		return new Length(0, 0, newMilimeter);
	}	

	int area(Length obj) {
		int area = this.toMilimeter() * obj.toMilimeter();
		return area;
	}

	int compare(Length obj) {
		int thisMilimeter = this.toMilimeter();
		int objMilimeter = obj.toMilimeter();

		if(thisMilimeter > objMilimeter) {
			return 1;
		} else if(thisMilimeter < objMilimeter) {
			return -1;
		} else {
			return 0;
		}
	}
}

class LengthClass {
	public static void main(String[] args) {
		System.out.println("\n-----Length Class With Functionality-----");
		System.out.println("\nLength Object 1 with 10 milimeter");
		Length obj1 = new Length(10);
		System.out.println("Length of obj1 is : " + obj1.toMilimeter());

		System.out.println("\nLength obj2 with 10 meter, 20 cm, 30 milimeter");
		Length obj2 = new Length(10, 20, 30);
		System.out.println("Length of obj2 is : " + obj2.toMilimeter());

		System.out.println("\nCompare Object 1 & Object 2");
		int check = obj1.compare(obj2);
		if(check == 0) {
			System.out.println("The obj1 length is equal to obj2");
		} else if(check == 1) {
			System.out.println("The object1 length is greater than obj2");
		} else if(check == -1) {
			System.out.println("The obj1 length is less than obj2");
		}

		System.out.println("\nAddition by 10 meter, 20 cm, 10 mm on obj1");
		Length res = obj1.add(new Length(10, 20, 20));
		System.out.println("Length of object after Addition is : " + res.toMilimeter());

		System.out.println("\nSubtraction operation by 5 mm on obj1");
		res = obj1.sub(new Length(0, 0, 5));
		System.out.println("Length of object after subtraction is : " + res.toMilimeter());

		System.out.println("\nMultiplication operation by 3 on obj1");
		res = obj1.mul(3);
		System.out.println("Length of object after multiplication is : " + res.toMilimeter());

		System.out.println("\nDivision operation by 5 on obj1");
		res = obj1.div(5);
		System.out.println("Length of object after division is : " + res.toMilimeter());
	}
}
