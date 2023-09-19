import java.util.*;

class NewThread extends Thread {
	int from, to;

	NewThread(int from, int to) {
		this.from = from;
		this.to = to;

		setName("Prime/ArmStrong Thread");
		start();
	}

	public void run() {
		try {
			for(int i = from; i < to; i++) {
				int len = (int)Math.log10(i) + 1;
				int sum = 0;

				int temp = i;
				while(temp > 0) {
					int rem = temp % 10;
					sum += Math.pow(rem, len);
					temp = temp / 10;
				}

				if(sum == i) {
					System.out.println(getName() + " => " + i + " : is Armstrong number");
				} else {
					System.out.println(getName() + " => " + i + " : is Not Armstrong number");
				}
				sleep(100);
			}
		} catch(InterruptedException e) {
			System.out.println("Exception Occured : " + e);
		}
	}
}

class ThreadExtClass {
	public static void main(String[] args) {
		System.out.println(".....Multiple Thread for Prime & Armstrong.....\n\n");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range for find Prime & Armstrong : ");
		System.out.print("From : ");
		int from = sc.nextInt();
		System.out.print("To : ");
		int to = sc.nextInt();

		NewThread obj = new NewThread(from, to);
		Thread t1 = Thread.currentThread();
		t1.setName("Main Thread");

		try {
			for(int i = from; i < to; i++) {
				int flag = 1;
				for(int j = 2; j < i / 2; j++) {
					if(i % j == 0) {
						flag = 0;
					}
				}

				if(flag == 0) {
					System.out.println(t1.getName() + " => " + i + " : is Not Prime Number");
				} else {
					System.out.println(t1.getName() + " => " + i + " : is Prime Number");
				}
				t1.sleep(100);
			}
		} catch(InterruptedException e) {
			System.out.println("Exception Occured : " + e);
		}
	}
}
