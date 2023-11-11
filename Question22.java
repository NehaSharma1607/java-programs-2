import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Question22 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for (int i = 0; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + "x" + i + "=" + result);
        }
        bufferedReader.close();
    }
}