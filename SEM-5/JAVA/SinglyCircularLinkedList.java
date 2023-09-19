import java.util.*;

class Node{
	int data;
	Node next;

	void append(Node obj){
		Node temp = this;

		if(this.next==null){
			temp.next=obj;
			obj.next=temp;
		}else{
			while(temp.next.data != this.data){
				temp=temp.next;
			}
			temp.next=obj;
			obj.next=this;
		}		
	}

	void display(){
		Node temp=this;

		if(temp.next==null){
			System.out.print(temp.data+" ");
		}else{
			while(temp.next.data != this.data){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println(temp.data+" ");
		}
	}

	boolean search(int data){
		Node temp=this;
		while(temp.data != data){
			temp=temp.next;
			if(temp.data!=data && temp.next.data==this.data){
				return false;				
			}
		}
		return true;
	}

	Node insert(Node obj,int data,int pos){

		Node temp=this;

		if(pos==1){

			if(temp.next==null){

				obj.next=temp;
				temp.next=obj;
				System.out.println("Node inserted successfully");
				return obj;

			}else{
				
				while(temp.next.data!=data){
					temp=temp.next;
				}
				obj.next=temp.next;
				temp.next=obj;
				System.out.println("Node inserted successfully");
			}

		}else if(pos==2){
			if(this.next==null){
				append(obj);
			}else{
				while(temp.data != data){
					temp=temp.next;
				}
				if(temp.next.data==this.data){
					obj.next=this;
					temp.next=obj;
				}else{
					obj.next=temp.next;
					temp.next=obj;
				}			
				System.out.println("Node inserted successfully");
				return this;
			}			
		}
		return this;
	}

	Node delete(int val){
		Node temp = this;
		Node head = this;

		if(head.next==null && head.data==val){
			head=null;
			System.out.println("Node deleted successfully");
			return head;
		}else{
			if(head.data == val){
				while(head.next.data != this.data){
					head=head.next;
				}
				head.next=temp.next;
				System.out.println("Node deleted successfully");
				return head.next;
			}else{
				while(temp.next.data != val){
					temp=temp.next;
				}
				temp.next=temp.next.next;
				System.out.println("Node deleted successfully");
				return this;
			}
		}
	}
}

class SinglyCircularLinkedList{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-----Singly Circular LinkedList-----\n");
		System.out.print("Enter size of linked-list : ");	
		int size = sc.nextInt();

		Node[] list = new Node[size];
		int choice;
		int inc=1;

		for(int i=0;i<size;i++){
			list[i]=new Node();
			System.out.print("Enter Element "+ inc +" : ");
			inc++;
			if(i>0){
				list[i].data=sc.nextInt();
				list[0].append(list[i]);
			}else{
				list[0].data=sc.nextInt();
				list[0].next=null;
			}
		}

		do{
			System.out.println("1 : Append\n2 : Insert\n3 : Delete\n4 : Search\n5 : Display\n");
			choice=sc.nextInt();

			Node temp=new Node();
			int pos,data;
			boolean ans;
			
			switch (choice) {
				case 1:
					System.out.print("\nEnter Value to append : ");
					temp.data=sc.nextInt();
					list[0].append(temp);
					System.out.println("Node appended successfully");
					break;

				case 2:		
					System.out.print("\nEnter Element : ");
					data=sc.nextInt();

					ans = list[0].search(data);

					if(ans){
						System.out.print("\nEnter element to insert : ");
						temp.data=sc.nextInt();

						do{
							System.out.println("\n1 : Before\n2 : After");
							pos = sc.nextInt();
						}while(pos>2);

						if(pos==1){
							list[0]=list[0].insert(temp,data,pos);
						}else if(pos==2){
							list[0]=list[0].insert(temp,data,pos);
						}
					}else{
						System.out.print("\nElement not found\n");
					}					
					break;

				case 3:
					System.out.print("\nEnter element to delete: ");
					data=sc.nextInt();

					ans = list[0].search(data);

					if(ans){
						list[0]=list[0].delete(data);
					}else{
						System.out.print("\nNode not found\n");
					}					
					break;

				case 4:
					System.out.print("\nEnter element for search : ");
					data = sc.nextInt();
					boolean res = list[0].search(data);
					if(res){
						System.out.print("\nNode found at Position : " + data + "\n");
					}else{
						System.out.print("\nNode not found in linked list\n");
					}				
					break;
				
				case 5:
					list[0].display();
					break;

				default:
					System.out.println("Invalid input\n");
			}
		}while(choice!=6);
	}
}