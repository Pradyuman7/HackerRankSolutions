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
        int d = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = scanner.nextInt();

        int[] newArr = new int[n];

        for(int i=0;i<n;i++){
            newArr[(i+n-d)%n] = arr[i];         
        }    

        for(int i=0;i<n;i++)
            System.out.print(newArr[i]+" ");
    }
}
