/*Part 2: Weight Guru Challenge
Create a Java program that tells whether your body to weight ratio is good or could be better.
The java app should take in your weight and height from the console and calculate your body to weight ratio.
You can use this article as a standardized guide for how to apply the logic. */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        float weight,height;

        System.out.println("Enter weight in KG");
        weight=sc.nextFloat();
        System.out.println("Enter height in feet");
        height= 0.3048f*(sc.nextFloat());

        float BMI= calcBMI(weight,height);
        String Result= AnalyseBMI(BMI);
        System.out.println("BMI is------------->"+BMI);
        System.out.println("RESULT is------------->"+Result);
    }
    public static float calcBMI(float weight, float height)
    {
        return weight/(height*height);
    }
    public static String AnalyseBMI(float BMI)
    {
        if (BMI<18.5)
        {
            return "UnderWeight";
        }
        else if (BMI>=18.5 && BMI<24.9)
        {
            return "Normal Weight";
        }
        else if (BMI>=25.0 && BMI<29.9)
        {
            return "Over Weight";
        }
        else if (BMI>=30.0)
        {
            return "Obese";
        }
        else
        {
            return "Invalid BMI";
        }
    }
}
