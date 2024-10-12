package SerializationDataTransfer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student std = new Student();
        std.setId(101);
        std.setName("Bahir");

        File file = new File("D:/Student.txt");

        if(!file.exists()){
            if(file.createNewFile()){
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
                output.writeObject(std);
                output.close();
                System.out.println("Success");
            }
        }
    }
}
