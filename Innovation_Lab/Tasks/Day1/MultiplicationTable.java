package Innovation_Lab.Tasks.Day1;

// Create a simple Java program to display a multiplication table

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int n=obj.nextInt();
		
		System.out.println("Multiplication Table of "+n);
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+"*"+i+"="+n*i);
		}
		
		obj.close();
}
}