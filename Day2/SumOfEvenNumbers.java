package Day2;

//write a program to find the sum of even numbers

import java.util.Scanner;

public class SumOfEvenNumbers {
  public static void main(String[] args) {
      
      Scanner obj = new Scanner(System.in);

      System.out.println("Enter the value of n:");
      int n = obj.nextInt();

      int sum=0;

      for(int i=1;i<=n;i++){
          if(i%2==0){
              sum+=i;
          }
      }

      System.out.println("Sum of Even numbers upto "+n+" is "+sum );

      obj.close();
  }   
}
