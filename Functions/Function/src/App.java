import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = console.next();
        printNameCharacters(name);
        printNameLength(name);
        console.close();
    }

    private static void printNameLength(String name) 
    {
        System.out.println(name.length());
    }
    private static void printNameCharacters(String name) 
    {
        System.out.println("Characters in your name:");
        for (int i = 0; i < name.length(); i++) 
        {
            System.out.println(name.charAt(i));
        }
    }
}
