package cseARollNo33;
import java.util.Scanner;

class Checker{
	int number;
	boolean prime=true;
	boolean answer;
	boolean checking() {
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				prime=false;
			}
		}
		return prime;
	}
}
public class CheckPrimeNum {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Checker check = new Checker();
		System.out.println("Enter the number");
		check.number = sc.nextInt();
		sc.close();
		check.answer = check.checking();
		System.out.println(check.number+ " is a prime Number :- " +check.prime);
	}
}
