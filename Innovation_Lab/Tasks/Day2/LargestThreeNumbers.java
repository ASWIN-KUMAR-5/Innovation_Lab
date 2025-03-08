package Innovation_Lab.Tasks.Day2;

//write a program to find the largest of three numbers

import java.util.Scanner;

public class LargestThreeNumbers{

public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter three numbers:");
    int a = obj.nextInt();
    int b = obj.nextInt();
    int c = obj.nextInt();

    if(a>b && a>c){
        System.out.println(a+" is largest of three numbers");
        }

    else if(b>a && b>c){
        System.out.println(b+" is largest of three numbers");
    }
    else{
        System.out.println(c+" is largest of three numbers");
    }

    obj.close();

    }
}
