/*********************************************************************
*             Author - Johns Raju                                    *
*             Name   - Inheritance                                   *
*            version - 1.0                                           *
*            Date   -  10/12/21                                      *
*********************************************************************/
import java.util.Scanner; 
class Employee{
	void display(float toDisplay){
		System.out.println("Salary = "+toDisplay);
		
	}
	float calcSalary(int basicSalary,int daPer,int hraPer){
		float da=(float)(daPer*basicSalary)/100;
		float hra= (float)(hraPer*basicSalary)/100;
		
		float grossSalary = basicSalary+da+hra;
		return grossSalary;
	}
}
class Engineer extends Employee{
	int basicSalary;
	int daPer;
	int hraPer;
	float grossSalary;
}
public class Inheritance {
	public static void main(String []arg) {
		System.out.println("Enter the Basic Salary of the Engineer");
		Scanner sc = new Scanner(System.in);
		Engineer eg = new Engineer();
		eg.basicSalary = sc.nextInt();
		
		System.out.println("Enter the DA of the Engineer:");
		eg.daPer = sc.nextInt();
		
		System.out.println("Enter the HRA of the Engineer:");
		eg.hraPer = sc.nextInt();
		
		
		eg.grossSalary = eg.calcSalary(eg.basicSalary,eg.daPer,eg.hraPer);
		eg.display(eg.grossSalary);
		sc.close();
	}
}
