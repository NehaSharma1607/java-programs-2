import java.util.Scanner;

public class EvenOddSumAvg

{

    public static void main(String[] args)

    {

        int n, sumE = 0, sumO = 0,countE=0,countO=0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in array:");

        n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();


        }

        for(int i = 0; i < n; i++)

        {

            if(a[i] % 2 == 0)

            {

                sumE = sumE + a[i];
                countE++;

            }

            else

            {

                sumO = sumO + a[i];
                countO++;

            }

        }

        System.out.println("Sum of Even Numbers:"+sumE+" and average is "+sumE/countE);

        System.out.println("Sum of Odd Numbers:"+sumO+" and average is "+sumO/countO);

    }

}


