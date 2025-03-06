package Day1;

//write a program to swap two numbers without using a third variable

import java.util.Scanner;

public class SwapNumber {
  public static void main(String[] args) {
      
      Scanner obj = new Scanner(System.in);

      System.out.println("Enter two numbers:");
      int a = obj.nextInt();
      int b = obj.nextInt();

      System.out.println("Before Swapping");
      System.out.println("a="+a+"\tb="+b);

      a=a+b;
      b=a-b;
      b=a-b;

      System.out.println("After Swapping");
      System.out.println("a="+a+"\tb="+b);

   obj.close();
   
  }  
}
