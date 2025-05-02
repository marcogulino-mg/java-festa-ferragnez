package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // * Vars
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // * Name Check
        System.out.println("Inserire nome e cognome...");
        String user = input.nextLine();

        // * Remove whitespace from both ends of user
        // * and extra whitespace between name and surname
        String trimUser = user.trim().replaceAll("\\s+", " ");

        // Checks whether the user is present in the array

        // for version
        // for (int i = 0; i < guests.length && trimUser != null; i++) {

        // if (trimUser.toLowerCase().equals(guests[i].toLowerCase())) {
        // System.out.println("Benvenuto alla festa " + guests[i]);
        // break;
        // } else if (i == (guests.length - 1)) {
        // System.out.println("Mi spiace " + trimUser + " ma non sei stato invitato alla
        // festa");
        // }
        // }

        // counter
        int i = 0;

        // while version
        while (i < guests.length) {
            if (trimUser.toLowerCase().equals(guests[i].toLowerCase())) {
                System.out.println("Benvenuto/a alla festa " + guests[i]);
                break;
            } else if (i == (guests.length - 1)) {
                System.out.println("Mi spiace " + trimUser + " ma non sei stato invitato alla festa");
            }
            i++;
        }

        // DEBUG
        System.out.println(trimUser);

        // * Scanner Closed
        input.close();

    }
}
