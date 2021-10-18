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




    }
}
