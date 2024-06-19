package CheckListOnlyODDNumber;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 5, 7, 9);
        boolean result = containsOnlyOddNumbers(numbers);
        System.out.println("Contains only odd numbers: " + result);
    }

    public static boolean containsOnlyOddNumbers(List<Integer> list){
        for(int number: list){
            if(number % 2 ==0){
                return false; // found an even number, return false
            }
        }
        return true; // all numbers are odd, return true
    }
}
