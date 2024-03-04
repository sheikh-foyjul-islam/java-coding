package chapter3;

import java.util.Scanner;

/*
Working of IF statement
All salespeople will get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250
*/
public class SalaryCommission {
public static void main (String[] args){
    //Given data
    int salary = 1000;
    int bonus=250;

    //Get the data from input: How many sales employee make this week?
    System.out.println("How many sales did employee make this week?");
    Scanner scanner=new Scanner(System.in);
    int numberofsales= scanner.nextInt();
    scanner.close();

    //Calculate bonus
    if (numberofsales>10){
        salary=salary+bonus;
    }
    //Showing output
    System.out.println("The employee salary for this week is: "+salary);


}
}
