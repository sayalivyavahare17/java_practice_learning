import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num_check;
        Scanner sc = new Scanner(System.in);
        num_check = sc.nextInt();

        int temp = num_check;
        int digit = 0;
        int rm;
        while(num_check>0)
        {
            rm = num_check % 10;
            digit = (digit*10) + rm;
            num_check/=10;
        }

        if(temp == digit)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
