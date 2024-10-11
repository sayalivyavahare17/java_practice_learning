import java.util.Scanner;

public class MovieDiscount {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age_range = sc.nextInt();
        float ticketPrice = 7;
        float discount;

        if (age_range < 5) 
        {
            discount = 0.60f * ticketPrice;
            float discountedPrice = ticketPrice - discount;
            System.out.println("You get a 60% discount. Your ticket price is: " + discountedPrice + " Euros");
        } 
        else if (age_range > 60) 
        {
            discount = 0.55f * ticketPrice;
            float discountedPrice = ticketPrice - discount;
            System.out.println("You get a 55% discount. Your ticket price is: " + discountedPrice + " Euros");
        } 
        else 
        {
            System.out.println("No discount: " + ticketPrice + " Euros");
        }
        sc.close();
    }
}
