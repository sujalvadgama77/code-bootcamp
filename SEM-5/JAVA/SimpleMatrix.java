import java.util.Scanner;
class SimpleMatrix
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int rows,cols;

		System.out.println("Enter Number of Rows : ");
		rows = s.nextInt();

		System.out.println("Enter Number of Coloumns : ");
		cols = s.nextInt();

		int[][]Matrix = new int[rows][cols];

		System.out.println("Number of Rows : "+rows+"\nNumber of Coloumns : "+cols);

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print("Enter values of Matrix["+i+"]["+j+"] : ");

			Matrix[i][j] = s.nextInt();
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}

}
}