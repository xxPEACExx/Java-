package com.company;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Please Write Your Name : ");
        String name = scanner.next();
        System.out.print("Please Write Your Surename : ");
        String surename = scanner.next();

        Email email1 = new Email(name,surename);

        email1.setMailboxCapacity(1000);
        System.out.print(email1.mailBoxCapacity());


        //System.out.println(email1.displayALL());

       // email1.setAlternateEmail("n_giourgen@yahoo.gr");
        //System.out.println(email1.getAlternateEmail());


    }
}
