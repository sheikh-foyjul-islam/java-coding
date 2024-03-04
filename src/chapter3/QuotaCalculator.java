package chapter3;

import java.util.Scanner;

/*
* IF Else condition checking
* This program will check the salesman's weekly quota
* weekly sales quota is 10
* If a person meets the quota, they will receive a congrates
* If does not meet they will be informed the remaining amount
*/
public class QuotaCalculator {
    public static void main(String[] args){
        int quota=10;
        //Take the data of weekly sales
        System.out.println("How many sales do you make this week?");
        Scanner scanner=new Scanner(System.in);
        int weeklysales= scanner.nextInt();
        scanner.close();

        //Compare the data
        if (weeklysales>=quota)
        {
            System.out.println("Congratulation! You will recieve a bonus");
        }
        else
        {
            int remaining=quota-weeklysales;
            System.out.println("You have to cover additional "+remaining+" sales to get a bonus");
        }
    }

}
