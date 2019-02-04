import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {  
   
   static byte primeCount(long n) {
      long[] array={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
      byte count=0;  
      long total=array[0];
        while(total<=n && total>0){
              count++;
              total*=array[count];
         }
      return count;
   }

   public static void main(String[] args) {
     Scanner x = new Scanner(System.in);
     int d = x.nextInt();
        for (int i=0; i<d; i++) {
            long n = x.nextLong();
            System.out.println(primeCount(n));
        }
    }
}
