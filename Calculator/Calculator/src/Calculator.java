import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + sub(num1, num2));
        System.out.println("Multiplication: " + mul(num1, num2));
        System.out.println("Division: " + div(num1, num2));
    }

    public static int add(int a, int b) 
    {
        return a + b;
    }
    public static int sub(int a, int b) 
    {
        return a - b;
    }
    public static int mul(int a, int b) 
    {
        return a * b;
    }
    public static int div(int a, int b) 
    {
        return a / b;
    }

}
