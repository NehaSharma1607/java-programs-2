import java.util.*;
//------------
/**
public class Implementation {
    //function to check if person is eligible to vote or not
    public static void validate(int age) {
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("not eligible to vote");
        }
        else {
            System.out.println("eligible to vote!!");
        }
    }
    //main method
    public static void main(String args[]){
        //calling the function
        Scanner s=new Scanner(System.in);
        System.out.println("Age is:");
        int age=s.nextInt();
        validate(age);
    }
}
**/
//-------------

class Triangle{
    int area;
    int perimeter;
    Triangle(int b,int h){ //constructor
        area=(b*h)/2;
        perimeter=b*3;
    }
}

class AOT{
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        //Taking the inputs
        System.out.println("base:");
        int b= s.nextInt();
        System.out.println("height:");
        int h= s.nextInt();

        Triangle t=new Triangle(b,h);
        System.out.println("Area of Triangle is: " + t.area);
        System.out.println("Perimeter of Triangle is:"+ t.perimeter);
    }
}
//-------------