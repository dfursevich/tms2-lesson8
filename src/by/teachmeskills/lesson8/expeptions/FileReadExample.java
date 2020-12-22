package by.teachmeskills.lesson8.expeptions;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Dzmitry Fursevich
 */
public class FileReadExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        try {
            byte[] bytes = fis.readAllBytes();
            System.out.println("new String(bytes) = " + new String(bytes));
        } finally {
            fis.close();
        }
    }
}
