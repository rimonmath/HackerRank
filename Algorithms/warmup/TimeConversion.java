import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        if(time.indexOf('P') > 0){
            int hh = Integer.parseInt(time.substring(0,2)) + 12;   
            if (hh == 24){
                hh =12;
            }
            System.out.print(hh + time.substring(2, time.length() -2));
        } else{
            int hh = Integer.parseInt(time.substring(0,2));
            if(hh == 12){
                System.out.print("00" + time.substring(2, time.length() -2));
            } else{
                System.out.print(time.substring(0, time.length() -2));
            }
        }
    }
}
