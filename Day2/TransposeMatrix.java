package Day2;

//write a program to find the transpose of a matrix

import java.util.Scanner; 

public class TransposeMatrix{

  public static void main(String[] args) {
      
      Scanner obj = new Scanner(System.in);

      System.out.println("Enter the number of rows of the matrix:");
      int rows = obj.nextInt();

      System.out.println("Enter the number of columns of the matrix:");
      int cols = obj.nextInt();

      int matrix[][] = new int[rows][cols];
      int Transpose[][] = new int[cols][rows];        

      System.out.println("Enter matrix elements of size "+rows+"x"+cols+":");
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
              matrix[i][j]=obj.nextInt();
          }
      }

      System.out.println("Tranposed matrix");
      for(int i=0;i<cols;i++){
          for(int j=0;j<rows;j++){
              Transpose[i][j]=matrix[j][i];
              System.out.print(Transpose[i][j]+" ");
          }
          System.out.println();
      }

      obj.close();
  }

}
