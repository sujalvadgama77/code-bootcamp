import java.util.Scanner;

class StackClass{

	int tos;
	int len;
	int stack[];

	StackClass(){
		tos = -1;
	}

	StackClass(int d_len){
		tos = -1;
		len = d_len;
		stack = new int[len];
	}

	void push(int ele){
		if(tos==len-1){
            int[] temp = new int[len*2];
            for(int i = 0;i<len;i++){
                temp[i]=stack[i];
            }
            stack=temp;
			stack[++tos]=ele;
			System.out.println("Pushed Element " +stack[tos] +" in stack");
            len=len*2;
		}else{
			stack[++tos]=ele;
			System.out.println("Pushed SElement " +stack[tos] +" in stack");
		}
	}

	void pop(){
		if(tos==-1){
			System.out.println("\nStack is empty!!!");
		}else{
			tos--;
			System.out.println("Popped element " +stack[tos+1] +" in stack");
		}
	}

	void display(){
		if(tos==-1){
			System.out.println("\nStack is empty.");
		}else{
			System.out.println("\n------Stack-----\n");
			for(int i=0;i<=tos;i++){
				System.out.print(stack[i] +" ");
			}
		}
	}

}

class Stack{
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int choice,ele,len;

		System.out.println("-----Dyanamic Stack-----\n");

		System.out.print("Enter initial size of stack : ");
		len=sc.nextInt();

		StackClass stk = new StackClass(len);
		
		do{
			System.out.print("\n1 : PUSH\n2 : POP\n3 : DISPLAY\n");
			choice = sc.nextInt();
			if(choice == 1){
				System.out.print("\nEnter element : ");
				ele=sc.nextInt();			
				stk.push(ele);			
			}else if (choice == 2) {
				stk.pop();
			}else if (choice == 3) {
				stk.display();
			}else if (choice == 4) {
				System.out.println("Thanks for visit");
			}else{
				System.out.println("\nInvalid input");
			}
		}while(choice!=4);
		
	}
}