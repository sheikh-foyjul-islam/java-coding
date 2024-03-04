package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] arg){
    //Get the number of hour worked
    System.out.println("Enter the Number Worked Hours:");
        Scanner scanner=new Scanner(System.in);
        double hours = scanner.nextDouble();
    //Get the hourly rate
        System.out.println("Enter the Employee's hourly rate:");
        double rate = scanner.nextDouble();
    //Multiply hours worked with hourly rate
double pay = hours*rate;
    //Display the result
        System.out.println("The Gross for the employee is:"+(pay));
    }
}