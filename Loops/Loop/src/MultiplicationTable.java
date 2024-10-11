import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int limit, multiplicand = 1, multiplier, product;

        System.out.println("Enter the limit for multiplication tables:");
        limit = console.nextInt();

        while (multiplicand <= limit) {
            multiplier = 1;
            System.out.println("The Multiplication Table for -------> " + multiplicand);

            while (multiplier <= 10) {
                product = multiplicand * multiplier;
                System.out.println("" + multiplicand + " X " + multiplier + " = " + product);
                multiplier++;
            }
            multiplicand++;
        }

        console.close();
    }
}
