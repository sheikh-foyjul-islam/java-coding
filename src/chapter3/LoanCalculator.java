package chapter3;

import java.util.Scanner;

/*
* Nested If Else
* To qualify for a loan a person must at least make $30,000
* Also, he should work for at least 2 years
 */
public class LoanCalculator {
    public static void main(String[] args){
        //Initialize the parameter values
int mustsalary=30000;
int workyear=2;
        //Take the input of person's monthly income
        System.out.println("What is your income per month:");
        Scanner scanner=new Scanner(System.in);
        int personincome= scanner.nextInt();
        //Take the input of person's work year
        System.out.println("What is your working year:");
        int workingyear= scanner.nextInt();
        //Calculate the loan eligibility
if (personincome>=mustsalary)
{
    if(workingyear>=workyear)
    {
        System.out.println("Congratulation! You are eligible for a loan");
    }
    else
        System.out.println("Sorry! You are not eligible for a loan as you worked for less then 2 year");
}
else
    System.out.println("Sorry! You are not eligible for a loan as you have below range income and worked for less than 2 years");

    }
}
