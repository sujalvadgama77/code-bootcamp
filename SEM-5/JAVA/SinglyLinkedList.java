import java.util.*;

class Node {
	int data;
	Node next;

	Node() {
		data = 0;
		next = null;
	}

	Node(int d_data, Node d_obj) {
		this.data = d_data;
		this.next = d_obj;
	}

	void append(Node obj) {
		Node temp = this;

		while(temp.next != null) {
			temp = temp.next;
		}

		temp.next = obj;
	}

	void display() {
		System.out.println("\nData of linked list is : ");
		Node temp = this;

		while(temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.print(temp.data + " ");
	}


	Node insert(int type, int data, Node obj) {
		Node temp = this;
		boolean flag = true;

			if(type == 1) {
				if(temp.data != data) {
					while(temp.next.data != data) {
						temp = temp.next;
						if(temp.next == null) {
							flag = false;
							break;
						}
					}
					if(flag == false) {
						System.out.println("\nThe " + data + " is not available in linked list");
					} else {
						obj.next = temp.next;
						temp.next = obj; 
					}
				} else {
					obj.next = temp;
					return obj;
				}
			} else if(type == 2) {
				while(temp.data != data) {
					temp = temp.next;
					if(temp == null) {
						flag = false;
						break;
					}
				}
				if(flag == false) {
					System.out.println("\nThe " + data + " is not available in linked list");
				} else {
					obj.next = temp.next;
					temp.next = obj; 
				}
			}
			return this;
	}

	Node delete(int data) {
		Node temp = this;
		boolean flag = true;

		if(temp.data != data) {
			while(temp.next.data != data) {
				temp = temp.next;
				if(temp.next == null) {
					flag = false;
					break;
				}
			}
			if(flag == false) {
				System.out.println("\nThe " + data + " is not available in linked list");
			} else {
				temp.next = temp.next.next;
			}	
			return this;	
		} else {
			return temp.next;
		}
	}

	void search(int data) {
		int count = 0;
		Node temp = this;
		boolean flag = true;

		while(temp.data != data) {
			temp = temp.next;
			count++;
			if(temp == null) {
				flag = false;
				break;
			}
		}
		if(flag == false) {
			System.out.println("\nThe " + data + " is not available in linked list");
		} else {
			System.out.println("\nThe " + data + " is founded in linked list at : " + (count + 1));
		}	
	}
}

class SinglyLinkedList {
	public static void main(String[] args) {
		int n, choice, data;
		boolean repe = true;
		Scanner sc = new Scanner(System.in);


		System.out.println("\n----- Singly LinkedList -----");
		System.out.println("Enter Number of Nodes to Insert : ");
		n = sc.nextInt();

		Node obj[] = new Node[n];
		int num = 1;
		for(int i = 0; i < n; i++) {
			System.out.println("\nEnter element "+ num +" : ");
			data = sc.nextInt();
			num++;

			obj[i] = new Node(data, null);

			if(i > 0) {
				obj[0].append(obj[i]);
			}
		}

		obj[0].display();

		while(repe) {
			System.out.print("\n\n1 : Insert \n2 : Delete \n3 : Search \n4 : Display");
			choice = sc.nextInt();

			if(choice == 1) {
				int ele, data_choice, data_pos;
				System.out.print("\nEnter the element to insert : ");
				ele = sc.nextInt();
				Node new_node = new Node(ele, null);

				System.out.print("\n1 : Before Element\n2 : After Element");
				data_choice = sc.nextInt();

				if(data_choice == 1) {
					System.out.print("\nEnter the Element : ");
					data_pos = sc.nextInt();

					Node first_node = obj[0].insert(1, data_pos, new_node);
					obj[0] = first_node;
					obj[0].display();
				} else if(data_choice == 2) {
					System.out.print("\nEnter the Element : ");
					data_pos = sc.nextInt();

					Node first_node = obj[0].insert(2, data_pos, new_node);
					obj[0] = first_node;
					obj[0].display();
				} else {
					System.out.println("\nInvalid Input");
				}
			} else if(choice == 2) {
				int ele;
				System.out.print("\nEnter the element to Delete : ");
				ele = sc.nextInt();

				Node first_node = obj[0].delete(ele);
				obj[0] = first_node;
				obj[0].display();
			} else if(choice == 3) {
				int ele;
				System.out.print("\nEnter the element to Search : ");
				ele = sc.nextInt();

				obj[0].search(ele);
			} else if(choice == 4) {
				obj[0].display();
				repe = false;
			} else {
				System.out.println("\nInvalid Input");
				repe = false;
			}
		}
	}
}