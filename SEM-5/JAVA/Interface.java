interface Bicycle
{
	void speed(int acc);
	void stop(int b);
}

class Avon implements Bicycle
{
	int a = 60;
	public void speed(int acc)
	{
		a = a+acc;
		System.out.println("---Total Speed---\n\n"+a);
	}
	public void stop(int b)
	{
		a = a-b;
		System.out.println("---Stop Speed---\n\n"+a);
	}
	
}

class Interface
{
	public static void main(String[] args) 
	{
			Avon obj1 = new Avon();
			obj1.speed(40);
			obj1.stop(60);

	}
}