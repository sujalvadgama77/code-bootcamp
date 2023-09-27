class Object
{
	int n;
	boolean isvalueset = false;

	synchronized int put(int n)
	{
		if (isvalueset == false)
		{
		this.n = n;
		System.out.println("Put : " + n);
		isvalueset = true;
		notify();	
		}
		else
		{
			try
			{
				wait();
			}
			catch(InterruptedException IE)
			{
				System.out.println("Exception : " + IE);
			}
		}
		return 0;
	}

	synchronized void get()
	{
		if (isvalueset == true)
		{
		System.out.println("Get : " + n);	
		isvalueset = false;
		notify();
		}
		else
		{
			try
			{
				wait();
			}
			catch(InterruptedException IE)
			{
				System.out.println("Exception : " + IE);
			}
		}
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

class SyncProducerConsumer
{
	public static void main(String[] args) 
	{
		Object obj = new Object();
		Producer p1 = new Producer(obj);
		Consumer c1 = new Consumer(obj);	
	}
}