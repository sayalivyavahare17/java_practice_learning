import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num_check, flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num_check = sc.nextInt();

        if (num_check == 0 || num_check == 1) 
        {
            for (int i = 2; i <= num_check / 2; i++) 
            {
                if (num_check % i == 0) 
                {
                    flag = 1;
                }
            }
            if (flag == 1) 
            {
                System.out.println("Number is not prime");
            } 
            else 
            {
                System.out.println("Number is prime");
            }
        }
    }
}
