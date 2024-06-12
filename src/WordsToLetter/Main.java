package WordsToLetter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scn.toString();
        wordstoletter.changeletter(name);

    }
}
