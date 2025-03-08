package Innovation_Lab.Tasks.Day3;

import java.util.Scanner;

public class Employee {

    private int employee_id;
    private int salary;

    public void setSalary(int a){
        this.salary=a;
    }

    public int getSalary(){
        return this.salary;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        Employee e1 = new Employee();

        System.out.print("Enter a salary:");
        int salary = obj.nextInt();

        if(salary<2000){
            System.out.println("Invalid!");
        }
        else{
            e1.setSalary(salary);
        }

        System.out.println(e1.getSalary());
           
        obj.close();
    }   
}
