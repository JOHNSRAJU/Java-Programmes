import java.util.*;
class Matrix{
	int row;
	int col;  
	
	void insertion(int [][] matrix,int row,int col) {
		 System.out.println("Enter the element");
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 System.out.println("Element["+i+"]["+j+"] :- ");
				 matrix[i][j]=sc.nextInt();
			 }
		 }
	 }
	
	void printing(int [][] matrix,int row,int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class MatrixMultiplication {
	public static void Multiplication(int[][] multiMatrix,int[][] matrix1,int[][] matrix2,int p,int q,int r,int s) {
		if(q!=r) {
			System.out.println("Multiplication is not possible");
		}
		else {
			for(int i=0;i<p;i++) {
				for(int j=0;j<s;j++) {
					multiMatrix[i][j]=0;
					for(int k=0;k<q;k++) {
						multiMatrix[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
			}
		}
		
	}
	
	
	public static void main(String arg[]) {
		System.out.println("Enter the number of rows of First matrix");
		Scanner sc = new Scanner(System.in);
		Matrix matrix1 = new Matrix();
		matrix1.row=sc.nextInt();
		System.out.println("Enter the number of columns of First matrix");
		matrix1.col=sc.nextInt();
		int[][] myMatrix1 = new int[matrix1.row][matrix1.col];
		matrix1.insertion(myMatrix1,matrix1.row,matrix1.col);
		matrix1.printing(myMatrix1,matrix1.row,matrix1.col);
		
		Matrix matrix2 = new Matrix();
		System.out.println("Enter the number of rows of second matrix");
		matrix2.row=sc.nextInt();
		System.out.println("Enter the number of columns of second matrix");
		matrix2.col=sc.nextInt();
		int[][] myMatrix2 = new int[matrix2.row][matrix2.col];
		matrix2.insertion(myMatrix2,matrix2.row,matrix2.col);
		matrix1.printing(myMatrix2,matrix2.row,matrix2.col);
		
		int[][] multiMatrix = new int[matrix1.row][matrix2.col];
		
		System.out.println("Your First Matrix :- \n");
		matrix1.printing(myMatrix1,matrix1.row,matrix1.col);
		System.out.println("Your Second Matrix :- \n");
		matrix1.printing(myMatrix2,matrix2.row,matrix2.col);
		
		Multiplication(multiMatrix,myMatrix1,myMatrix2,matrix1.row,matrix1.col,matrix2.row,matrix2.col);
		System.out.println("Multiplied Matrix :- \n");
		
		matrix1.printing(multiMatrix, matrix1.row, matrix2.col);
		sc.close();
	}
	
}
