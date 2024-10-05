package MockInterview;

import java.util.Scanner;

public class Day03 {
    public static void main(String[] args){
        String name = "Bahir Hussain 878";
        int count = 0;
        int numcount = 0;
        int spacecount = 0;
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(Character.isLetter(ch)){
                count++;
            }
            if(Character.isDigit(ch)){
                numcount++;
            }
            if(Character.isSpaceChar(ch)){
                spacecount++;
            }
        }
        System.out.println(count);
        System.out.println(numcount);
        System.out.println(spacecount);

        System.out.println("Enter Your Number: ");
        Scanner scn = new Scanner(System.in);
        int answer = 1;
        int num = scn.nextInt();
        for(int i=1; i<=num; i++){
            answer = answer*i;
        }
        System.out.println(answer);
    }
}
