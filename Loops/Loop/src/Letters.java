import java.util.Scanner;

public class Letters {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String s = sc.nextLine(); 

        for (int i = 0; i < s.length(); i++) 
        {
            System.out.println(s.charAt(i));
        }

        sc.close(); 
    }
}
