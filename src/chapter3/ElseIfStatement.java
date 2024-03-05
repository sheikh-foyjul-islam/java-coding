package chapter3;

import java.util.Scanner;

/*
Display a letter grade for a student based on their test score
 */
public class ElseIfStatement {
    public void main(String[] args)
    {
//Get the test result
        System.out.println("Enter your test score");
        Scanner scanner=new Scanner(System.in);
        double testscore= scanner.nextDouble();
        //Determine the grade
        char grade;
        if (testscore<=59)
        {
            grade='F';
        }
        else if (testscore<=69)
        {
        grade='D';
        }
        else if (testscore<=79)
        {
         grade='C';
        }
        else if (testscore<=89)
        {
            grade='B';
        }
        else
        {
           grade='A';
        }
        System.out.println("Your Grade is: "+grade);
    }
}
