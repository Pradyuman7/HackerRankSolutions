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
        String str = scan.nextLine();

        Set<Character> set = new HashSet<Character>();
        for(Character ch : str.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }

        System.out.println((set.size()<=1)?"YES":"NO");


    scan.close();

    }
    
}
