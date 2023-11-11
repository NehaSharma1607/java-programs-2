import java.util.Scanner; // compulsory line; scanner is used to get user input
public class Demo { //class
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //object;
        Scanner sc1=new Scanner(System.in); //object;
        System.out.println("enter the value of a:");
        int a=sc.nextInt();  //method; linked with object;
        System.out.println("the value of a is "+a); //concatenation using +
        System.out.println("enter the value of a:");
        String b=sc1.nextLine();  //method; linked with object;
        System.out.println("the value of a is "+b); //concatenation using +
    }
}
/**
{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int N=sc.nextInt();
        for(int i=0;i<=10;i++){
        int result=N*i;
        System.out.println(N+"x"+i+"="+result);
        }

        }}
 **/