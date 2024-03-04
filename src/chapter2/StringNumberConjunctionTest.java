package chapter2;

import java.util.Scanner;

public class StringNumberConjunctionTest {
    public static void main(String[] arg){
        //Take the type of the day
        System.out.println("How was the day?");
        Scanner scanner=new Scanner(System.in);
        String adj = scanner.next();

        //Take the name of the season
        System.out.println("What Was the Season?");
        String season = scanner.next();

        //Take the number of coffee take
        System.out.println("How many cup of coffee did you take?");
        int coffee = scanner.nextInt();

        //Display the result
        System.out.println("On a "+adj+" "+season+" day I drink a minimum of "+coffee+ " cup of coffee");

    }
}
