import java.util.*;

class Node {
	int data;
	Node next;
	Node pre;

	Node() {
		data = 0;
		next = null;
		pre = null;
	}

	Node(int d_data, Node d_obj, Node d_pre_obj) {
		this.data = d_data;
		this.next = d_obj;
		this.pre = d_pre_obj;
	}

	void append(Node obj) {
		Node temp = this;

		if(temp.next != null) {
			while(temp.next != this) {
				temp = temp.next;
			}
		}

		temp.next = obj;
		obj.pre = temp;
		obj.next = this;
		this.pre = obj;
	}

	void display() {
		System.out.println("\nLinked list : ");
		Node temp = this;

		while(temp.next != this) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");

		Node end = temp;
		System.out.println("\nLinked list by pre : ");
		while(temp.pre != end) {
			System.out.print(temp.data + " ");
			temp = temp.pre;
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
						if(temp == this) {
							flag = false;
							break;
						}
					}
					if(flag == false) {
						System.out.println("\n" + data + " not Found! ");
					} else {
						obj.next = temp.next;
						obj.pre = temp;
						temp.next = obj; 
						temp.next.pre = obj;
					}
				} else {
					while(temp.next != this) {
						temp = temp.next;
					}

					temp.next = obj;
					obj.pre = temp;
					obj.next = this;
					this.pre = obj;
					return obj;
				}
			} else if(type == 2) {
				while(temp.data != data) {
					temp = temp.next;
					if(temp == this) {
						flag = false;
						break;
					}
				}
				if(flag == false) {
						System.out.println("\n" + data + " not Found! ");
				} else {
					temp.next.pre = obj;
					obj.next = temp.next;
					obj.pre = temp;
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
				if(temp.next == this) {
					flag = false;
					break;
				}
			}
			if(flag == false) {
						System.out.println("\n" + data + " not Found! ");
			} else {
				temp.next.next.pre = temp;
				temp.next = temp.next.next;
			}	
			return this;	
		} else {
			while(temp.next != this) {
				temp = temp.next;
			}
			temp.next = this.next;
			this.next.pre = temp;
			return this.next;
		}
	}

	void search(int data) {
		int count = 0;
		Node temp = this;
		boolean flag = true;

		while(temp.data != data) {
			temp = temp.next;
			count++;
			if(temp == this) {
				flag = false;
				break;
			}
		}
		if(flag == false) {
						System.out.println("\n" + data + " not Found! ");
		} else {
			System.out.println("\n " + data + " is found  at : " + (count + 1));
		}	
	}
}

class DoublyCircularLinkedList {
	public static void main(String[] args) {
		int n, choice, data;
		boolean repe = true;
		Scanner sc = new Scanner(System.in);


		System.out.println("\n----- Doubly Circular Linked List -----");
		System.out.println("Enter size of List : ");
		n = sc.nextInt();

		Node obj[] = new Node[n];
		int inc=1;
		for(int i = 0; i < n; i++) {
			System.out.println("\nEnter Ellement " + inc + " : ");
			data = sc.nextInt();
			inc++;

			obj[i] = new Node(data, null, null);

			if(i > 0) {
				obj[0].append(obj[i]);
			}
		}

		obj[0].display();

		while(repe) {
			System.out.print("\n\n1 : Insert\n2 : Delete\n3 : Search\n4 : Display");
			choice = sc.nextInt();

			if(choice == 1) {
				int ele, data_choice, data_pos;
				System.out.print("\nEnter element to insert : ");
				ele = sc.nextInt();
				Node new_node = new Node(ele, null, null);

				System.out.print("\n1 : Before data\n2 : After data\n");
				data_choice = sc.nextInt();

				if(data_choice == 1) {
					System.out.print("\nEnter Element : ");
					data_pos = sc.nextInt();

					Node first_node = obj[0].insert(1, data_pos, new_node);
					obj[0] = first_node;
					obj[0].display();
				} else if(data_choice == 2) {
					System.out.print("\nEnter Element : ");
					data_pos = sc.nextInt();

					Node first_node = obj[0].insert(2, data_pos, new_node);
					obj[0] = first_node;
					obj[0].display();
				} else {
					System.out.println("\nInvalid Input");
				}
			} else if(choice == 2) {
				int ele;
				System.out.print("\nEnter element to delete : ");
				ele = sc.nextInt();

				Node first_node = obj[0].delete(ele);
				obj[0] = first_node;
				obj[0].display();
			} else if(choice == 3) {
				int ele;
				System.out.print("\nEnter element to search : ");
				ele = sc.nextInt();

				obj[0].search(ele);
			} else if(choice == 4) {
				obj[0].display();
			} else {
				System.out.println("\nInvalid Input");
				repe = false;
			}
		}
	}
}


