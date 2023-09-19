class NewThread implements Runnable{
	Thread t1;

	NewThread(){
		t1 = new Thread(this,"Child Thred");
		t1.start();
	}

	public void run(){
		try{
			for(int i=0;i<15;i++){
				System.out.println(t1.getName()+" : "+i);
				t1.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Exception caught : "+e);
		}
	}
}

class Threads{
	public static void main(String[] args) {
		System.out.println("------Thread with Run------");
		new NewThread();
		Thread t = Thread.currentThread();
		

		try{
			for(int i=15;i<16;i++){
				System.out.println(t.getName()+" : "+i);
				t.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Exception caught : "+e);
		}
	}
}