import java.util.Scanner;

public class TaskOne
{
        public static void main(String[] args)
    {
        System.out.println(sumTwoNumber());
    }
    public static int sumTwoNumber()
    {
        Scanner scan = new Scanner(System.in);
        int numbOne = scan.nextInt();
        int numbTwo = scan.nextInt();;
        return numbOne + numbTwo;

    }
}