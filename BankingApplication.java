import java.util.*;
import java.io.*;
class InvalidAmountException extends Exception{
	InvalidAmountException( String message){
		super(message);
	}
}
class InsufficientFundException extends Exception{
	InsufficientFundException(String message){
		super(message);
	}
}
class Bank{
	String accountNumber;
	String name;
	int balance;
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void displayDetails() {
		System.out.println("______________________________");
		System.out.println("Name :- "+name);
		System.out.println("Account Number :- "+accountNumber);
		System.out.println("Balance :- "+balance);
	}
	void openAccount() {
			System.out.println("Enter the details of person : ");
			System.out.println("Name :- ");
			try {
				name=br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Account Number :- ");
			accountNumber=sc.next();
			System.out.println("Balance :- ");
			balance=sc.nextInt();
			
		}
	boolean search(String accNo) {
		if (accNo.equals(accountNumber)) {
			return (true);
		}
		else {
			return (false);
		}
	}
	
	void deposit() {
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		try {
			if(amount<=0){
				throw new InvalidAmountException("Invalid Amount");
			}
			else{
				System.out.println("Amount is Credited");
				balance=balance+amount;
				
				System.out.println("Your Current Balance :- "+balance);
			}
		}
		catch(InvalidAmountException e) {
			System.out.println(e);
		}
		
	}
	void withdraw(){
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		try {
			if(amount<=0){
				throw new InvalidAmountException("Invalid Amount");
			}
			else if(amount>balance){
				throw new InsufficientFundException("Insufficient Balance");
			}
			else{
				System.out.println("Amount is Debited");
				balance=balance-amount;
				System.out.println("Your Current Balance :- "+balance);
			}
		}
		catch(InvalidAmountException e) {
			System.out.println(e);
		}
		catch(InsufficientFundException e) {
			System.out.println(e);
		}
		
	}
	
}
public class BankingApplication {
	public static void main(String []args) {
		boolean person = false;
		String accNo;
		int i,noOfAcc;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no. of customers");
		noOfAcc=sc.nextInt();
		Bank custo[] = new Bank [noOfAcc];
		for(i=0;i<noOfAcc;i++) {
			custo[i] = new Bank();
			custo[i].openAccount();
		}
		System.out.println("Displaying all accounts");
		for(i=0;i<noOfAcc;i++) {
			custo[i].displayDetails();
		}
		int option;
		do {
			System.out.println("_____________________________");
			System.out.println("Choose your Option");
			System.out.println("1.Display All Accounts\n2.Search account\n3.Deposit\n4.Withdraw\n5.Exit");
			option = sc.nextInt();
			switch (option){
				case 1:
					for(i=0;i<noOfAcc;i++) {
						custo[i].displayDetails();
					}
					break;
				case 2:
					System.out.println("Enter your Account Number");
					accNo=sc.next();
					for(i=0;i<noOfAcc;i++) {
						person = custo[i].search(accNo);
						if (person) {
							custo[i].displayDetails();
							break;
						}
					}
					if(!person) {
						System.out.println("Account Not Found !");
					}
					break;

				case 3 :
					System.out.println("Enter your Account Number");
					accNo=sc.next();
					for(i=0;i<noOfAcc;i++) {
						person = custo[i].search(accNo);
						if (person) {
							custo[i].deposit();
							break;
						}
					}
					if(!person) {
						System.out.println("Account Not Found !");
					}
						
					break;
				case 4 :
					System.out.println("Enter your Account Number");
					accNo=sc.next();
					for(i=0;i<noOfAcc;i++) {
						person = custo[i].search(accNo);
						if (person) {
							custo[i].withdraw();
							break;
						}
					}
					if(!person) {
						System.out.println("Account Not Found !");
					}
					break;
				case 5 :
					System.out.println("Thank you");
					break;
				default :
					System.out.println("Invalid selection");						
			}
				
		}while(option!=5);
	}
		
}
