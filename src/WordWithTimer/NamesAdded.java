package WordWithTimer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamesAdded {
    public void namesadd(String name){
        List<String> names = new ArrayList<>();

        displayNames disname = new displayNames();
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to MBH System Company");
        SystemTimer st = new SystemTimer();

        while (true){
            System.out.println("Enter Name: ");
            String input = scn.nextLine();

            names.add(input);
            disname.DisplayNames(names);
        }
    }
}
