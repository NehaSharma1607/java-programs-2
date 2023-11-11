import java.util.*;
/**
 * search character
public class LabMst {
    public static void main(String args[])
    {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = str.nextLine();

        Scanner word=new Scanner(System.in);
        System.out.println("Enter the character to search for: ");
        char search = word.next().charAt(0);             // Character to search is 'a'.

        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }

        System.out.println("The Character '"+search+"' appears "+count+" times.");
    }
}
 **/
/**
 * search word
public class LabMst {
    public static void main(String[] args) {
        Scanner sentence=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sentence.nextLine();
        boolean results=text.contains("the");
        if(results==true){
            System.out.println("Word exists in string");
        }
        else{
            System.out.println("Word not found");
        }

    }
}
**/
/**
 //abstract class
abstract class LabMst{
    abstract void run();
}
class Honda4 extends LabMst{
    void run(){
        System.out.println("running safely");
    }
    public static void main(String[] args){
        LabMst obj = new Honda4();
        obj.run();
    }
}
 **/
/**
 * triangle area perimeter
class LabMst{
    int area;
    int perimeter;
    LabMst(int b,int h){ //Creating a constructor
        area=(b*h)/2;
        perimeter=b*3;
    }
}

class AOT{
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        //Taking the inputs
        System.out.println("Enter the width of the  equilateral triangle:");
        int b= s.nextInt();
        System.out.println("Enter the height of the equilateral triangle:");
        int h= s.nextInt();

        LabMst AT=new LabMst(b,h); //Calling constructor
        System.out.println("Area of Triangle is: " + AT.area);
        System.out.println("Perimeter of Triangle is:"+ AT.perimeter);
    }
}
 **/
/**
 * Exception handling
public class LabMst {
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]);
            System.out.println(myNumbers[5]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
 **/
/**
 //* getter setter
class Account{
    private String myName;
    private double myBalance;
    public void BankAccount(){
        myName="a";
        myBalance=0.0;
    }
    public void setName(String name){
        this.myName=name;
    }
    public String getName(){
        return myName;
    }
    public void setBalance(double balance){
        this.myBalance=balance;
    }

    public double getBalance(){
        return myBalance;
    }
    public void withdraw(double amount){
        myBalance=myBalance-amount;
    }
    public void deposit(double amount){
        myBalance=myBalance+amount;
    }
}
public class LabMst{
    public static void main(String[] args){
        Account a = new Account();
        a.setName("John Doe");
        a.setBalance(100.2);
        a.withdraw(10.0);
        System.out.print(a.getName()+"'s Balance is:"+ a.getBalance());
    }
}
 **/