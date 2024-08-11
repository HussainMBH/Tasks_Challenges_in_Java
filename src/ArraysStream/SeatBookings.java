package ArraysStream;

import java.util.Arrays;
import java.util.Scanner;

public class SeatBookings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String seatsdetails[] = new String[5];
        System.out.println("Enter seats ");

        for(int i=0; i<seatsdetails.length; i++){
            System.out.println("Enter Seat " + (i+1) + " : ");
            seatsdetails[i] = scn.nextLine();
        }

        System.out.println(Arrays.stream(seatsdetails));
    }
}
