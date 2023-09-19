import java.util.Scanner;

class Matrix {

    int row,column,rawTotal,columnTotal,rowCount,columnCount,diagonalTotal,antiDiagonalTotal,total;
    int matrix[][];
    boolean falgTotal,falgRow,flagColumn,flagDiagonal,flagAntiDiagonal;

    Scanner sc = new Scanner(System.in);

    Matrix(){
      row=column=rawTotal=columnTotal=rowCount=columnCount=diagonalTotal=antiDiagonalTotal=total=0;
      falgTotal=falgRow=flagColumn=flagDiagonal=flagAntiDiagonal=false;
    }

    void setMatrix() {
      System.out.print("Enter num of rows : ");
      row = sc.nextInt();
      System.out.print("Enter num of columns : ");
      column = sc.nextInt();

      matrix = new int[row][column];

      for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
          System.out.print("Enter value for (" + (i + 1) + "," + (j + 1) + ") : ");
          matrix[i][j] = sc.nextInt();
        }
      }
  }

  void getMatrix() {
    System.out.println("\n-----Matrix-----");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
  }

  void checkMatrix(){
    if(row != column){
      System.out.println("\nThis matrix is not a Magic Matrix!!!");
    }else{      
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
          if(!falgTotal){
            total += matrix[i][j];
          }
          rawTotal += matrix[i][j];
          falgRow = true;
        }        
        if(!falgTotal){
          falgTotal = true;
        }      
        if(falgRow){
          if(total == rawTotal){
            rowCount++;
          }
        }
        rawTotal = 0;
        falgRow = false;

      }

      if(row != rowCount){
        System.out.println("\nThis matrix is not a Magic Matrix!!!");           
      }else{
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < column; j++) {
            columnTotal += matrix[j][i];
            flagColumn = true;
          }        
          if(flagColumn){
            if(total == columnTotal){
              columnCount++;
            }
          }
          columnTotal = 0;
          flagColumn = false;
        }

        if(rowCount != columnCount){
          System.out.println("\nThis matrix is not a Magic Matrix");           
        }else{
          int k = 0;
          for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
              if(i == j){
                diagonalTotal+=matrix[j][i];
              }
              if(k==i && j == (column-i-1)){
                antiDiagonalTotal+=matrix[i][j];
                k++;
              }
            }
            if(total == diagonalTotal && total == antiDiagonalTotal){
              flagDiagonal = true;
              flagAntiDiagonal = true;
            }                
          }
          if(flagDiagonal && flagAntiDiagonal){
            System.out.println("\nThis matrix is a Magic Matrix");   
          }else{
            System.out.println("\nThis matrix is not a Magic Matrix!!!"); 
          } 
        }
      }
    }
  }
}

class MagicMatrix{
  public static void main(String args[]){
    Matrix m = new Matrix();
    m.setMatrix();
    m.getMatrix();
    m.checkMatrix();
  }
}