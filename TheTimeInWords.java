import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

static String[] hours = {"","one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve "};
    
    static String[] minutes = {"o' clock", "one minute ","two minutes ", "three minutes ", "four minutes ", "five minutes ", "six minutes ", "seven minutes ","eight minutes ", "nine minutes ","ten minutes ", "eleven minutes ","twelve minutes ", "thirteen minutes ","fourteen minutes ","quarter ", "sixteen minutes ", "seventeen minutes ", "eighteen minutes ", "ninteen minutes ", "twenty minutes ","twenty one minutes ", "twenty two minutes ","twenty three minutes ", "twenty four minutes ","twenty five minutes ", "twenty six minutes ", "twenty seven minutes ","twenty eight minutes ", "twenty nine minutes ","half "};
    

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
         String time = "";
        if(m==0){
            time = hours[h]+minutes[m];            
        }else if(m==15){
            time = minutes[m]+"past "+hours[h];
        }else if(m==30){
            time = minutes[m]+"past "+hours[h];
        }else if(m==45){
            time = minutes[15]+"to "+hours[h+1];
        }else if(m<30){
             time = minutes[m]+"past "+hours[h];
        }else if(m>30){
            time = minutes[60-m]+"to "+hours[h+1];
        }
        return time;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(timeInWords(h,m));
    }
        
}
