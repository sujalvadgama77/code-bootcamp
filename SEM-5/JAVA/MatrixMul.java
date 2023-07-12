import java.util.Scanner;
class MatrixMul
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int rows,cols,k;

		System.out.println("Enter Number of Rows : ");
		rows = s.nextInt();

		System.out.println("Enter Number of Coloumns : ");
		cols = s.nextInt();

		int[][]Matrix1 = new int[rows][cols];
		int[][]Matrix2 = new int[rows][cols];
		int[][]Matrix3 = new int[rows][cols];


		System.out.println("Number of Rows : "+rows+"\nNumber of Coloumns : "+cols);

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print("Enter values of Matrix1["+i+"]["+j+"] : ");

			Matrix1[i][j] = s.nextInt();
			}
		}

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print("\n\nEnter values of Matrix2["+i+"]["+j+"] : ");

			Matrix2[i][j] = s.nextInt();
			}
		}

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				for(k=0;k<cols;k++){
					Matrix3[i][j]+=Matrix1[i][k]*Matrix2[k][j];
				}
			}
		}


		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(Matrix3[i][j]+" ");
			}
			System.out.println();
		}

}
}