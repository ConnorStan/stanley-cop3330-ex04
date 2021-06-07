/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */

package ex04;

import java.util.Scanner;

public class madLib {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("Enter a noun. ");
        String noun = in.nextLine();
        System.out.print("Enter a verb. ");
        String verb = in.nextLine();
        System.out.print("Enter an adjective. ");
        String adjective = in.nextLine();
        System.out.print("Enter an adverb. ");
        String adverb = in.nextLine();


        // Single line Output
        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's Hilarious!" );
    }
}
