import java.util.Scanner;

class sstack{
	double[] data= new double[10];
	Scanner sc = new Scanner(System.in);
	int tos = -1;

	void push(double value){
		if(tos==9){
			System.out.println("Stack Overflow");
		}
		else{
			data[++tos]=value;	
		}
		
	}

	double pop(){
		if(tos==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			return data[tos--];	
		}
		
	}

	double peek(){
		if(tos==-1){
			System.out.println("Queue is Empty !");
		}
		System.out.println(+data[tos]);
		return 0;
	}
}

class Stack{
	public static void main(String[] args) {
		sstack s = new sstack();
		Scanner sc = new Scanner(System.in);
		for(;;){
			int choice;
			System.out.println("1 : PUSH \n2 : POP \n3 : PEEP \n0 : EXIT ");
			choice = sc.nextInt();

			if(choice==1){
				double value;
				System.out.println("Enter element to push: ");
				value = sc.nextDouble();
				s.push(value);
			}
			else if(choice == 2){
				double ans =s.pop();
				System.out.println("Poped element: "+ ans);
			}
			else if(choice == 3){
				double ans = s.peek();
				System.out.println(ans);
			}
			else if(choice == 4){
				break;
			}
			else{
				System.out.println("Enter proper operation");
			}

		}
	}
}