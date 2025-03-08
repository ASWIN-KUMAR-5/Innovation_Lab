package Innovation_Lab.Tasks.Day1;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = obj.nextDouble();
        System.out.print("Enter your height: ");
        double height = obj.nextDouble();

        double bmi = weight / (height * height);
        
        System.out.println("Your BMI is: "+bmi);
        
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        
        obj.close();
    }
}

