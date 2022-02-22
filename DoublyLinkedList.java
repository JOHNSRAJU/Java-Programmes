package day4;
import java.util.*;
public class DoublyLinkedList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int choice,val;
		do {
			System.out.println("Eneter the choice");
			System.out.println("\n1.Insert at beginning\n2.Insert at end\n3.Insert at particlular position\n4.Delete at beginning\n5.Delete at end\n6.Delete at particular\n7.EXIT");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the value");
					val=sc.nextInt();
					list.add(0,val);
					System.out.println(list);
					break;
				case 2:System.out.println("Enter the value");
					val=sc.nextInt();
					list.add(val);
					System.out.println(list);
					break;
				case 3:
					System.out.println("Enter the position");
					int pos = sc.nextInt();
					System.out.println("Enter the value");
					val=sc.nextInt();
					list.add(pos-1,val);
					System.out.println(list);
					break;
				case 4:
					val=list.remove(0);
					System.out.println("Removed element:"+val);
					System.out.println(list);
					break;
				case 5:
					val=list.remove((list.size())-1);
					System.out.println("Removed element:"+val);
					System.out.println(list);
					break;
				case 6:
					System.out.println("Enter the position to be deleted:");
					pos=sc.nextInt();
					val=(int) list.remove(pos-1);
					System.out.println("Removed element:"+val);
					System.out.println(list);
					break;
				case 7:
					System.out.println("Bye......Thank u");
					break;
				default: System.out.println("Enter a valid option");
				break;
			}
		}while(choice!=7);
	}
}