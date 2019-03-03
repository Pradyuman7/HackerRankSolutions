import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int gcd(int n1, int n2){
        if (n2 != 0)
            return gcd(n2, n1%n2);
        else 
            return n1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int x1,x2,y1,y2,T;

        T = scanner.nextInt();

        for(int i=0;i<T;i++){
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();

            System.out.println(gcd(Math.abs(y2-y1), Math.abs(x2-x1)) - 1);
        }
        
        scanner.close();
    }
}
