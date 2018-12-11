import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
        

    long[] arr = new long[n];
        
    int lower;
    int upper;
    long sum;

    for(int i=0;i<n;i++) 
        arr[i]=0;

    for(int i=0;i<m;i++){

        lower=scan.nextInt();
        upper=scan.nextInt();
        sum=scan.nextInt();

        arr[lower-1]+=sum;

        if(upper<n) 
            arr[upper]-=sum; 
    }
        
    long max=0;
    long temp=0;

    for(int i=0;i<n;i++){
        temp += arr[i];

        if(temp> max) 
            max=temp;
    }

    System.out.println(max);
   }
}
