package DayChallenges.FindSmallestNumber;

import java.util.Scanner;

public class FindMiniNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double a = scn.nextDouble();
        System.out.println(" Second Number: ");
        double b = scn.nextDouble();
        System.out.println("Enter Third Number: ");
        double c = scn.nextDouble();
        FindSmallest objfind = new FindSmallest();
        System.out.println(objfind.smallest(a,b,c));
        System.out.println(objfind.maximumnum(a,b,c));
    }
}
