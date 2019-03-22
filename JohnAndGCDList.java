import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int t = scanner.nextInt();

        while(t-- > 0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++)
                arr[i] = scanner.nextInt();

            int[] ans = new int[n+1];

            for(int i=0;i<n;i++){
                if(i == 0)
                    ans[i] = arr[i];
                else{
                    int lcm = (arr[i-1] * arr[i])/(gcd(arr[i-1],arr[i]));
                    ans[i] = lcm;
                }
                System.out.print(ans[i]+" ");
            }
        
            System.out.println(arr[n-1]);
        }
    }
           
}
