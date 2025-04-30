package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Vars
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // Name Check
        System.out.println("Inserire nome e cognome...");
        String user = input.nextLine();

        // Remove whitespace from both ends of user
        // and extra whitespace between name and surname
        String trimUser = user.trim().replaceAll("\\s+", " ");

        // DEBUG
        System.out.println(trimUser);

    }
}
