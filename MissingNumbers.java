import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aLen = sc.nextInt();
        Integer[] A = new Integer[aLen];
        for(int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        
        int bLen = sc.nextInt();
        Integer[] B = new Integer[bLen];
        for(int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        
        sc.close();
        
        int[] result = new int[201];
        int pivot = A[0];
        
        for(int i = 0; i < A.length; i++) {
            int distance = A[i] - pivot;
            result[100 + distance]--;
        }
        
        for(int i = 0; i < B.length; i++) {
            int distance = B[i] - pivot;
            result[100 + distance]++;
        }
        
        for(int i = 0; i < result.length; i++) {
            if(result[i] > 0) {
                int value = i - 100 + pivot;
                System.out.print(value + " ");
            }
        }
    }
}
