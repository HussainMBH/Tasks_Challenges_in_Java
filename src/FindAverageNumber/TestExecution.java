package FindAverageNumber;

import java.util.Scanner;

public class TestExecution {
    public void testaverage(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstnum = scn.nextInt();
        System.out.println("Enter Second Number: ");
        int secondnum = scn.nextInt();
        System.out.println("Enter Third Number: ");
        int thirdnum = scn.nextInt();

       findaveragenumber obj = new findaveragenumber();
       int output = obj.averagenumber(firstnum, secondnum, thirdnum);
        System.out.println("Average Number "+output);
    }
}
