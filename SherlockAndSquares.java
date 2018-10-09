import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0)
            {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println((int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1);
        }
    }
}
