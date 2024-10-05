package CollectionFramework.ArrayListCF;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 5 names");
        for(int i=0; i<5; i++){
            names.add(scn.nextLine());
        }
        System.out.println(names);
    }
}
