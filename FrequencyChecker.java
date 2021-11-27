package cseARollNo33;

import java.util.Scanner;

class Check1{
	String input;
	char element;
	int count;
	int stringLength;
	void checking() {
		stringLength = input.length();
		for(int i=0;i<stringLength;i++) {
			if(input.charAt(i) == element) {
				count++;
			}
		}
	}
}
public class FrequencyChecker {
	public static void main(String arg[]) {
		Check1 check = new Check1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		check.input = sc.nextLine();
		System.out.println("Enter character to find frequency");
		check.element = sc.next().charAt(0);
		sc.close();
		check.checking();
		System.out.println("No.Of occurence = "+check.count);
		
	}
}
