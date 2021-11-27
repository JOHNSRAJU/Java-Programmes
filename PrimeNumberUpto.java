
import java.util.Scanner;
class PrimeNumber{
	int number;
	boolean prime;
	boolean primeCheck(int num) {
		prime = true;
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				prime = false;
			}
		}
		return prime;
	}
}
public class PrimeNumberUpto {
public static void main(String arg[]) {
	System.out.println("Enter the number");
	PrimeNumber check = new PrimeNumber();
	Scanner sc = new Scanner(System.in);
	check.number = sc.nextInt();
	sc.close();
	System.out.println("Prime Numbers are :- ");
	for(int i=2;i<check.number;i++) {
		boolean returnValue = check.primeCheck(i);
		if(returnValue == true) {
			System.out.print(i+"\t");
		}
	}
}

}
