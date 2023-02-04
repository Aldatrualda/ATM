package user;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements FunctionsOfUser {
    private String name;
    private String lastName;
    public static long customerID = 0;
    private int PIN;
    //by default balance of user equals 0.0
    private double balance = 0.0;
    private String password;

    static ArrayList<User> arrayList = new ArrayList<>();

    public User(String name, String lastName, int PIN) {
        this.name = name;
        this.lastName = lastName;
        this.PIN = PIN;
        this.balance = balance;

    }


    public static void createUser() {
        Scanner sc = new Scanner(System.in);
        //Every user has their unique ID
        customerID++;

        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        System.out.print("Enter your surname: ");
        String userSurname = sc.nextLine();
        System.out.print("Enter your PIN: ");
        int userPIN = sc.nextInt();

        //create user by asking necessary info
        User user = new User(userName, userSurname, userPIN);
        FunctionsOfUser.showInfo(user);
        arrayList.add(user);
        System.out.println("You signed up successfully");

        for (User u : arrayList) {
            System.out.println(u);
        }
    }

//    public static void signIn() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String userName = sc.nextLine();
//        System.out.print("Enter your surname: ");
//        String userSurname = sc.nextLine();
//        System.out.print("Enter your PIN: ");
//        int userPIN = sc.nextInt();
//    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + " Surname: " + this.lastName
                + " PIN: "
                + this.PIN;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
