package org.guneet.ObjectOriented;

import java.util.Scanner;

/**
 * Potential Passenger uses this system to reserve a flight ticket
 * for a given schedule
 * Created by gunee on 4/2/2016.
 */
public class ReservationSystem {

    public static void main(String[] args) {
        System.out.print("Enter Passenger First Name");
        String firstName = "";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            firstName = sc.next();
        }
        System.out.println();


        System.out.print("Enter Passenger Last Name");
        String lastName = "";
        sc = new Scanner(System.in);
        if (sc.hasNext()) {
            lastName = sc.next();
        }
        System.out.println();

        String age;
        Integer numAge = 0;
        while (true) {

            System.out.print("Enter Passenger Age");
            sc = new Scanner(System.in);
            if (sc.hasNext()) {
                age = sc.next();
                try {
                    numAge = new Integer(age);
                    if (numAge < 18 || numAge > 120) {
                        throw new NumberFormatException("Invalid age.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Please enter valid age [18..120]");
                }
            }
        }
        System.out.println();
        String gender;
        while (true) {
            System.out.print("Enter Passenger Gender(M/F)");

            sc = new Scanner(System.in);
            if (sc.hasNext()) {
                gender = sc.next();
                if (gender.equals("M") || gender.equals("F")) {
                    break;
                } else {
                    System.out.println("Please enter only M/F");
                }
            }
        }
        System.out.println();
        Passenger passenger = new Passenger(firstName + " " + lastName,
                numAge, gender);

        System.out.println("Thank you! Passenger info: " +passenger);
    }
}
