package com.company;

import javax.swing.plaf.IconUIResource;
import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.Locale;
import java.util.Scanner;

public class Email {

    //String variables
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private String email;
    private String companyName = ".company.com.gr" ;

    //Integer variables
    private int mailboxCapacity;
    private int defaultPasswordLength = 15 ;

    //Constructor
    public Email(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println();
        this.department = setDepartement();
        System.out.println("You Choose Department: "+this.department);

        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" +department.toLowerCase() + companyName.toLowerCase() ;
        System.out.println("Your New Email Is : "+email);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("And Your password is : "+this.password);

    }

    private String setDepartement(){

        System.out.println("Please Enter The Department\n" +
                "1 For Sales\n" +
                "2 For Development\n" +
                "3 For Accounting\n" +
                "4 For None");
        System.out.print("Choose One Department : ");
        Scanner scannerIn = new Scanner(System.in);

        int departmentChoise = scannerIn.nextInt();
        if (departmentChoise == 1){
            return "Sales";
        }
        else if (departmentChoise == 2){
            return "Development";
        }
        else if (departmentChoise == 3){
            return "Accounting";
        }
        else{
            return  "None";
        }


    } // End of setDepartement


    private String randomPassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_-+";
        char[] password = new char[passwordLength];

        for (int i=0;i<passwordLength;i++){
           int rand = (int)(Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    public int getMailboxCapacity(){

        return mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }


    public void changePassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public String mailBoxCapacity(){

        return "\nMailBox Capacity : "+getMailboxCapacity() + "MB(Mega Byte)";


    }

    public String displayALL(){

        return "First Name : "+firstName +"\nLast Name : " + lastName +
                "\nCompany Email : "+email + "\nMailBox Capacity : "+mailboxCapacity + "MB(Mega Byte)";
    }


}
