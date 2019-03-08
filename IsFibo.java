import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    // A number is Fibonacci if and only if one or both of (5*n^2 + 4) or (5*n^2 – 4) is a perfect square
    static String solve(double n) {
        if(isPerfectSquare(5*n*n - 4) || isPerfectSquare(5*n*n + 4))
            return "IsFibo";
        else
            return "IsNotFibo";    
    }

    static boolean isPerfectSquare(double x){
        double sqr = Math.sqrt(x);
        return (sqr == Math.floor(sqr));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();

        while(t-- > 0){
            double n = scanner.nextDouble();
            System.out.println(solve(n));
        }        

    }
}
