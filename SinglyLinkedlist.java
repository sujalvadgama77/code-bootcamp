import java.util.*;

class Node
{
	int data;
	Node next;

void Append(Node obj)
{	
	Node temp = this;

	while(temp.next != null)
	{
		temp = temp.next;
	}
	temp.next = obj;
	obj.next = null;
}

void Display()
{
	System.out.println("----Linked List----");
	Node temp=this;
	while(temp.next != null)
	{
		System.out.print(" "+temp.data);
		temp = temp.next;	
	}
		System.out.print(" "+temp.data);
}
}

boolean Insert(Node obj,int data)
{
	Node temp=this;
	boolean flag = flase;

	while(temp.next != data)
	temp = temp.next;
	if(temp.next==null)
	{
		flag=true;
		break;
	}
}

class SinglyLinkedlist 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter size of Linked list :");
		n = s.nextInt();

		Node[] list = new Node[n];
		for(int i=0;i<n;i++)
		{
			list[i] = new Node();
			System.out.println("Enter Value "+(i+1)+" : ");
			if(i>0)
			{
				list[i].data=s.nextInt();
				list[0].Append(list[i]);
			}
			else
			{
				list[0].data=s.nextInt();
			}
		}

		int choice;
		System.out.println("Enter Choice :\n1:Display\n2:Insert\n3:Delete\n4:Search\n5:Exit");
		choice = s.nextInt();	
		switch(choice)
		{
	
		case 1:
			list[0].Display();
			break;

		case 2:

			list[0].Insert();
			break;

		case 3:
			break;

		case 4:
			break;

		case 5:
			System.out.println("Thank you");
			break;

		default:
		System.out.println("Invalid Input");
		}
	}
}