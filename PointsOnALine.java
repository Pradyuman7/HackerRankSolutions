import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int x, y, flag = 0;

        for(int i=0;i<n;i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            a[i] = x;
            b[i] = y;
        }

        for(int i=1;i<n;i++){
            if(a[i] - a[i-1] != 0 && b[i] - b[i-1] != 0){
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            System.out.println("NO");
        else
            System.out.println("YES");    

        scanner.close();
    }
}
