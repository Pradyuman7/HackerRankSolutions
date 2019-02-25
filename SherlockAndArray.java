import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static String satisfiesConditions(int[] arr){
        int start = 0;
        int n = arr.length;
        int end = n - 1;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < n; i++){
            if(i == 0) {
                leftSum += arr[start];
                rightSum += arr[end];
            } 
            else if (start < end) {
                if(leftSum < rightSum) {
                    start++;
                    leftSum += arr[start];
                } 
                else {
                    end--;
                    rightSum += arr[end];
                }
            } 
            else 
                break;
        }

        if(leftSum == rightSum) 
            return "YES";
        else 
            return "NO";
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = scanner.nextInt();

            if(arr.length == 1)
                System.out.println("YES");    
            else
                System.out.println(satisfiesConditions(arr));    
        }
    

        scanner.close();
    }
    
}
