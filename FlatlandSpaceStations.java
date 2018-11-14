import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main( String[] args ) {

    Scanner in = new Scanner( System.in );
    int n = in.nextInt();
    int m = in.nextInt();
    int[] num = new int[m];

    for( int i = 0 ; i < m ; i++ ) 
        num[i] = in.nextInt();

    in.close();
    Arrays.sort(num);
    int max = num[0];

    for( int i = 1 ; i < m ; i++ ) 
        max = Math.max( max, (num[i] - num[i - 1])/2);

    max = Math.max( max, (n - 1 - num[m - 1]));

    System.out.print(max);

}
    
}
