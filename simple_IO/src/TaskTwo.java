import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskTwo
{
    public static void main(String[] args)
    {

            int result = 0;

            try (Scanner scanner = new Scanner(new File("input.txt")))
            {
                result = scanner.nextInt() + scanner.nextInt();
                System.out.println(result);
                PrintWriter pw = new PrintWriter(new File("output.txt"));
                pw.println(result);
                pw.close();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }
}
