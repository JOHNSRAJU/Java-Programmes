import java.util.*;
class string{
	String myString;
	int length;
	
	boolean checkPalindrome(String string) {
		boolean palindrome=true;
		for( int i = 0;i<this.length/2;i++) {
			if(string.charAt(i)!=string.charAt(this.length-1-i)) {
				palindrome=false;
			}
		}
		return palindrome;
	}
}
public class PalindromeOrNot {
	public static void main(String arg[]) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		string str = new string();
		str.myString = sc.next();
		sc.close();
		str.length= str.myString.length();
		boolean palindrome= str.checkPalindrome(str.myString);
		System.out.println("Is palindrome :- "+palindrome);
	}
}
