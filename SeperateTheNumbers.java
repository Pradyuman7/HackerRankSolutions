import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        if(s.length() == 1 || s.charAt(0) == 0){
            System.out.println("NO");
            return;
        }

        long num = 0;
        boolean mark = false;    

        char[] arr = s.toCharArray();
        
        for(int i=1;i<=arr.length/2;i++){
            String first = s.substring(0,i);
            long temp = Long.parseLong(first);
            num = temp;

            String k = Long.toString(num);
            while (k.length() < s.length()) {
                k += Long.toString(++temp);
            }

            if (k.equals(s)) {
                mark = true;
                break;
            }
        }
        
        if(mark == true)
            System.out.println("YES "+num);
        else
            System.out.println("NO");    
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while(q-- > 0) {
            String s = scanner.nextLine();
            separateNumbers(s);
        }

        scanner.close();
    }
}
