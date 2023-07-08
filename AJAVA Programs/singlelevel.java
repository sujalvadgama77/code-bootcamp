class singlelevel 
{
	void eat()
	{
		System.out.println("eating...");
	}  
}  
	class Dog extends singlelevel
	{  
		void bark()
		{
			System.out.println("barking...");
		}  
	}  
	class Testsinglelevel
	{  
	public static void main(String args[])
	{  
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
	}
}