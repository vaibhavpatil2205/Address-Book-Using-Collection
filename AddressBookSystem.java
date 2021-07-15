package com.addressbook;

import java.util.Scanner;

public class AddressBookSystem {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    long phoneNumber;
    long zipCode;

    public AddressBookSystem(String firstName, String lastName, String address, String city, String state, String email, long phoneNumber, long zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter address: ");
        String address = scanner.next();
        System.out.print("Enter city: ");
        String city = scanner.next();
        System.out.print("Enter state: ");
        String state = scanner.next();
        System.out.print("Enter zip: ");
        long zipcode = scanner.nextLong();
        System.out.print("Enter phone no: ");
        long phoneNumber = scanner.nextLong();
        System.out.print("Enter email: ");
        String email = scanner.next();

        AddressBookSystem addressBook = new AddressBookSystem(firstName, lastName, address, city, state, email, phoneNumber, zipcode);
        
       
    }
}




