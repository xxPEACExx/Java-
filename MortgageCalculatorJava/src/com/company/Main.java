package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        int years = 0;
        int numberOfPayments = 0;

        double monthlyInterest = 0;
        double mortgage = 0;
        double extra = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Add The Principal between 1000 (1K) and 10000000 (10M) : " );
        while (true) {
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 10_000_000)
                break;
            System.out.print("Enter a value between 1000 (1K) and 10000000 (10M) : ");
        }
        System.out.println();


        System.out.print("Please Type The Annual Tnterest Rate : " );
        while (true){
            double annualInterst = scanner.nextDouble();
            monthlyInterest =(double) annualInterst / PERCENT / MONTHS_IN_YEAR;

            if (annualInterst >= 1 && annualInterst <= 30)
                break;
            System.out.print("Enter A Value Between 1 AND 30 : ");

        }
        System.out.println();


        System.out.print("Please Add Period In Years : ");
        while (true){
            years = scanner.nextInt();
            numberOfPayments = years * MONTHS_IN_YEAR;

            if(years >= 1 && years <=100)
                break;
            System.out.print("Enter A Value For Years Between 1 and 100 : ");
        }
        System.out.println();


        mortgage = (principal
                        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) -1) ) );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage Per Month Equal To : "+mortgageFormatted);

         extra = ((mortgage * MONTHS_IN_YEAR) * years) - principal ;

        System.out.println("From "+principal  +" That You Took. You Need To Pay "+extra +" Extra.");


    }
}
