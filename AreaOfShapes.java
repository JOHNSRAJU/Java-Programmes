/*********************************************************************
*             Author - Johns Raju                                    *
*             Name   - Overloading                                   *
*            version - 1.0                                           *
*            Date   -  10/12/21                                      *
*********************************************************************/
import java.util.Scanner;
class Area{
	float AreaOfShape(float radius){
		float areaOfCircle =(float) 3.14*radius*radius;
		return areaOfCircle;
	}
	int AreaOfShape(int length,int breadth) {
		int areaOfRectangle = length*breadth;
		return areaOfRectangle;
	}
	float AreaOfShape(float base,int height) {
		float areaOfTriangle = (float) 0.5*base*height;
		return areaOfTriangle;
	}
}
public class AreaOfShapes {
	public static void main(String arg[]) {
		System.out.println("Enter your option");
		System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
		Scanner sc = new Scanner(System.in);
		int option=sc.nextInt();
		Area area = new Area();
		if(option==1) {
			System.out.println("Enter the radius of the circle");
			float radius = sc.nextFloat();
			float areaOfCircle= area.AreaOfShape(radius);
			System.out.println("Area of Circle = "+areaOfCircle);
		}
		else if(option==2){
			System.out.println("Enter the length and breadth of the rectangle");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			int areaOfRectangle= area.AreaOfShape(length,breadth);
			System.out.println("Area of Rectangle = "+areaOfRectangle);
		}
		else if(option==3) {
			System.out.println("Enter the base and height of the triangle");
			float base = sc.nextFloat();
			int length = sc.nextInt();
			float areaOfTriangle= area.AreaOfShape(base,length);
			System.out.println("Area of Triangle = "+areaOfTriangle);
		}
		else {
			System.out.println("Enter a correct option");
		}
		sc.close();
	}
	
}
