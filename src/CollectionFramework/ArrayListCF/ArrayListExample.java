package CollectionFramework.ArrayListCF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 names");
        for(int i=0; i<3; i++){
            names.add(scn.nextLine());
        }
        System.out.println(names);

        names.add(1,"Hussain");

        System.out.println("After add method " + names);

        //Changing Elements(first remove that element and it'll replace new element
        names.set(1, "mohamed");
        System.out.println("After Set method " + names);

        //Removing Function
        names.remove(1);
        System.out.println("After Remove method " + names);

        //Removing exact element
        names.remove("zain");
        System.out.println("After remove exact element " + names);
    }
}
