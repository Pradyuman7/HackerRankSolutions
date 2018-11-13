import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int chap = scanner.nextInt();
        int prob = scanner.nextInt();
        int s = 0;
        int pages = 0;
        for(int i=0;i<chap;i++){
            int chpProb = scanner.nextInt();
            int pgNo = pages+1;
            int count = 0;
            for(int j=1;j<=chpProb;j++){
                if(j==pgNo)
                     s++;
                if(j%prob==0 && j<chpProb){
                     pgNo++;
                }
            }
            pages=pgNo;
        }
        System.out.println(s);
    }
}
