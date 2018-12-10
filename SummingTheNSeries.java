import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i=0;i<T;i++){
            BigInteger n = in.nextBigInteger();
            System.out.println(n.multiply(n).mod(new BigInteger("1000000007")));
        }

        in.close();
    }
}
