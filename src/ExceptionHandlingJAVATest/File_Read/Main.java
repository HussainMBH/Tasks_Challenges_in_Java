package ExceptionHandlingJAVATest.File_Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            readFile("Main.java");
        }catch (FileNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scn = new Scanner(file);

        while ((scn.hasNextLine())) {

            String line = scn.nextLine();
            System.out.println(line);
        }
        scn.close();
    }
}
