import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 

        public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min_dist = n;
        for (int i=0; i<n; i++){
            int x = in.nextInt();
            if (map.containsKey(x)){
                if((i - map.get(x)) < min_dist)
                    min_dist = i - map.get(x);
            } 
            map.put(x, i);
        }
        System.out.print(min_dist == n ? -1 : min_dist);
    }


}
