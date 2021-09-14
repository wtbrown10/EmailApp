package com.will;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defualtPasswordLength = 10;
    private String email;
    private String companyName = "AstroTech";
    private Integer mailBoxCapacity = 500;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // call a method asking for the department - return department and set it
        this.department = setDepartment();
//        System.out.println("Department: " + department);

        //call a method that returns a random password
        this.password = randomPassword(defualtPasswordLength);
        System.out.println("Your New Password is: " + password);

        // combine elements to generate email
//        this.email = generateEmail(this.firstName, this.lastName, this.department);
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName + ".com" ;
//        System.out.println("Your New Email is: " + this.email);
    }

    private String setDepartment(){
        System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num == 1) {
            return "Sales";
        } else if(num == 2){
            return "Development";
        } else if(num == 3){
            return "Accounting";
        } else {
            return "none";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

//    private String generateEmail(String firstN, String lastN, String departmentN){
//        String str = firstN + "." + lastN + "@" + departmentN + ".AstroTech.com";
//        return str;
//    }


    public void setMailBoxCapacity(Integer capacity) {
        this.mailBoxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public Integer getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String password) {
        this.password = password;
    }
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nEMAIL: " + email + "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
