import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t;
        t = scanner.nextInt();
        
        while(t-->0) {
        
            int n,a,b;
            int sum = 0, first = 0;

            n = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();

            first=(n-1)*(Math.min(a,b));

            System.out.print(first+" ");

            while(sum+first<(n-1)*(Math.max(a,b))) {
                sum+=Math.abs(b-a);
                System.out.print(first+sum+" ");
            }
            
            System.out.println();
        }

        scanner.close();
    }
}
