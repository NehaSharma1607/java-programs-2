import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 5 elements of the array: ");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }
        // loop through the numbers one by one
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 1)
                isPrime = false;
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            // print the number
            if (isPrime)
                System.out.println(array[i] + " is a prime number in the array ");
            else{
                System.out.println(" NO  prime number in the array ");
                break;
            }
        }
    }
}



