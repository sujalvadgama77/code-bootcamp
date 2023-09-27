class Object
{
	int n;

	synchronized int get()
	{
		System.out.println("The Number got : " + n);
		return n;
	}

	synchronized void put(int num)
	{
		this.n = num;
		System.out.println("The Number put : "+ n);
	}
}

class Producer implements Runnable
{
	Object obj;

	Producer(Object obj)
	{
		this.obj = obj;
		new Thread(this, "Producer").start();
	}

	public void run()
	{
		int i = 0;
		while(true)
		{
			obj.put(i);
			i++;
		}
	}
}

class Consumer implements Runnable
{
	Object obj;

	Consumer(Object obj)
	{
		this.obj = obj;
		new Thread(this, "Consumer").start();
	}

	public void run()
	{
		while(true)
		{
			obj.get();
		}
	}
}

class producer_consumer
{
	public static void main(String[] args) 
	{
		Object obj = new Object();
		Producer p1 = new Producer(obj);
		Consumer c1 = new Consumer(obj);	
	}
}