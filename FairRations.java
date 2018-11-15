// Very simple logic based on the fact that E + E = E and O + O = E

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n,loaves=0;
        n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }    

        int len = arr.length;

        if(sum%2==0){
            for(int i = 0; i<len; i++){
                if(arr[i] % 2 != 0){
                    arr[i] = arr[i] + 1;
                    arr[i+1] = arr[i+1] + 1;
                    loaves+=2;
                }
            }
        System.out.println(loaves);

        }

        else
            System.out.println("NO");    



    }
}
