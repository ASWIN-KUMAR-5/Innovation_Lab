package Day2;

//write a program to check if a given number is prime

import java .util.Scanner;

public class PrimeNumberChecker{

  public static void main(String[] args) {
      
      Scanner obj = new Scanner(System.in);

      System.out.println("Enter a number:");
      int n = obj.nextInt();

      boolean flag = true;

      for(int i=2;i<=n/2;i++){

          if(n%i==0){
              flag = false;
              break;
          }
      }
      if (flag){
          System.out.println(n+" is a prime number");
      }
      else{
          System.out.println(n+" is not a prime number");
      }

      obj.close();

  }
}