/*Part 2: Do While loops
Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	... */
import java.util.Scanner;

public class Fibonacci {
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
