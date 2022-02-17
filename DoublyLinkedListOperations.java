import java.util.Scanner;
public class DoublyLinkedListOperations {
	Node head = null;
	Node tail = null;
	
	class Node{
		int data;
		Node previous;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedListOperations dll = new DoublyLinkedListOperations();
		int option,value,pos;
		do {
			System.out.println("\n===========================================");
			System.out.println("Choose your option");
			System.out.println("1.Insertion at First\n2.Insertion at End\n3.Insertion at particular position");
			System.out.println("4.Deletion at First\n5.Deletion at End\n6.Delation at particular position");
			System.out.println("7.Display Doubly Linked List\n8.Exit");
			System.out.println("===========================================");
			option = sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Enter the data to input");
					value=sc.nextInt();
					dll.insertionFirst(value);
					dll.display();
					break;
				case 2 :
					System.out.println("Enter the data to input");
					value=sc.nextInt();
					dll.insertionLast(value);
					dll.display();
					break;
				case 3 :
					System.out.println("Enter the data to input");
					value=sc.nextInt();
					System.out.println("Enter the value position to input");
					pos=sc.nextInt();
					dll.insertionParticularPosition(value,pos);
					dll.display();
					break;
				case 4 :
					dll.deletionFirst();
					dll.display();
					break;
				case 5:
					dll.deletionEnd();
					dll.display();
					break;
				case 6:
					System.out.println("Enter the position to delete");
					pos=sc.nextInt();
					dll.deletionParticularPosition(pos);
					dll.display();
					break;
				case 7:
					dll.display();
					break;
				case 8:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("Enter a valid option");
			}
		}while(option!=8);
		sc.close();
	}
	void insertionFirst(int data) {
		
		Node temp = new Node(data);
		if(head==null) {
			head=temp;
			tail=temp;
			head.previous=null;
			tail.next=null;
		}
		else {
			temp.next=head;
			head.previous=temp;
			head=temp;
			head.previous=null;
		}
	}
	void insertionLast(int data) {
		Node temp = new Node(data);
		if(head==null) {
			head=temp;
			tail=temp;
			head.previous=null;
			tail.next=null;
		}
		else {
			tail.next=temp;
			temp.previous=tail;
			temp.next=null;
			tail=temp;
			
		}
	}
	void insertionParticularPosition(int data,int pos) {
		if(pos==1) {
			insertionFirst(data);
		}
		else {
			Node current = head;
			Node temp = new Node(data);
			for(int i=1;i<pos;i++) {
				current=current.next;
			}
			if(current.next==null) {
				insertionLast(data);
			}
			Node currentPrev = current.previous;
			current.previous=temp;
			temp.next=current;
			temp.previous=currentPrev;
			currentPrev.next=temp;
		}
		
	}
	void deletionFirst() {
		if(head == null) {
			System.out.println("Linked List is empty");
		}
		else if (head.next==null){
			System.out.println("Deleting element :- "+head.data);
			head=tail=null;
		}
		else {
			System.out.println("Deleting element :- "+head.data);
			head=head.next;
			head.previous=null;
		}
	}
	void deletionEnd() {
		if(head == null) {
			System.out.println("Linked List is empty");
		}
		else if (head.next==null){
			System.out.println("Deleting element :- "+head.data);
			head=tail=null;
		else {
			System.out.println("Deleting element :- "+tail.data);
			tail=tail.previous;
			tail.next=null;
		}
	}
	void deletionParticularPosition(int pos) {
		if(pos==1) {
			deletionFirst();
		}
		else if (head.next==null){
			System.out.println("Deleting element :- "+head.data);
			head=tail=null;
		else {
			Node current = head;
			for(int i=1;i<pos;i++) {
				current=current.next;
			}
			if(current.next==null) {
				deletionEnd();
			}
			else {
				System.out.println("Deleting element :- "+current.data);
				Node currentPrev = current.previous;
				currentPrev.next=current.next;
				current=current.next;
				current.previous=currentPrev;
			}
		}
		
	}
	void display() {
		Node current = head;
		System.out.println("Your Doubly Linked list :- ");
		while(current!=null) {
			System.out.print(current.data+"  ");
			current=current.next;
		}
	}
}