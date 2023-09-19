import java.util.*;

class MatrixMultiplication{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int rows,columns;

		System.out.println("\n-----Matrix Multipliation----");

		System.out.print("\nEnter no of rows : ");
		rows=sc.nextInt();

		System.out.print("Enter no of columns : ");
		columns=sc.nextInt();

		int[][] matrix1=new int[rows][columns];
		int[][] matrix2=new int[rows][columns];
		int[][] mul=new int[rows][columns];


		System.out.print("\nEnter value for Matrix1 ("+rows+","+columns+")\n\n");

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print("Enter value for Matrix1 ("+i+","+j+") : ");
				matrix1[i][j]=sc.nextInt();
			}
		}

		System.out.print("\nEnter value for Matrix2 ("+rows+","+columns+")\n\n");

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print("Enter value for Matrix2 ("+i+","+j+") : ");
				matrix2[i][j]=sc.nextInt();
			}
		}

		System.out.println("\n-----Matrix 1-----\n");

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("\n-----Matrix 2-----\n");

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("\n-----Multiplication of Matrix 1 and Matrix 2-----\n");


		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				for(int k=0;k<columns;k++){
					mul[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
				
			}
		}		

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}		

	}	
}