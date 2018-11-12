import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String swap(String k,int i,int j)
    {
        StringBuilder sb = new StringBuilder(k);
        
        sb.setCharAt(i,k.charAt(j));
        
        sb.setCharAt(j,k.charAt(i));
        
        return sb.toString();
    }

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String k) {
        String ans="no answer";
        
        String s= "";
        
        int flag=0,index=0;
        
        int i=k.length()-1;
        
        while(i>0 && k.charAt(i-1)>=k.charAt(i))
            i--;
        
        if(i<=0)
            return ans;
        
        int j=w.length()-1;
        
        while(k.charAt(j)<=k.charAt(i-1))
            j--;

        
        s=swap(k,(i-1),j);
        char ar[]=s.toCharArray();
        Arrays.sort(ar,i,ar.length);
        return String.valueOf(ar);
    }

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
