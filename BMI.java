import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        /**** Coding Challenge ****/
        //Write a java program that allow user to enter their weight and
        // height,and display the body mass index for the user.

        //the formula is BMI=kg/m2 where kg is a person's weight in kilogram
        //and m2 is their height in meters squared.


        System.out.println("Enter your weight (in kilogram): ");
        //To get input from user
        Scanner scan=new Scanner(System.in);
        float weight=scan.nextFloat();

        System.out.println("Enter your height(in metres): ");
        float height=scan.nextFloat();

        float BMI=weight/(height*height);
        System.out.println("THE BMI IS: "+BMI);

    }
}
