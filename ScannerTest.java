import java.io.*;
import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) throws IOException {
        File in = new File("java/week15/test1.txt");
        File out = new File("java/week15/test2.txt");
        Scanner input = new Scanner(in);
        PrintWriter output = new PrintWriter(out);
        while(input.hasNextLine()) {
            output.println(input.nextLine());
        }
        input.close();
        output.close();
    }
}