package ExceptionHandlingJAVATest.FileReadandPositiveNumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readFile("D:\\Java Learn\\java mini project\\Tasks Challenges\\src\\ExceptionHandlingJAVATest\\FileReadandPositiveNumber\\test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Error: Negative number found: " + e.getNumber());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException, NegativeNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int number = Integer.parseInt(line);
            if (number <= 0) {
                throw new NegativeNumberException(number);
            }
            System.out.println(line);
        }

        scanner.close();
    }
}

class NegativeNumberException extends Exception {
    private int number;

    public NegativeNumberException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
