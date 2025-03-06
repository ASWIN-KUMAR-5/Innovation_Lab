package Day1;

//write a program to calculate the area of rectangle

import java.util.Scanner;

public class Rectangle{
  public static void main(String[] args) {
      
      Scanner obj= new Scanner(System.in);

      System.out.print("Enter the Length of the rectangle:");
      int l = obj.nextInt();
      System.out.print("Enter the Breadth rectangle:");
      int b = obj.nextInt();

      int area=l*b;

      System.out.println("Area of Rectangle is "+ area);

      obj.close();
  }
}