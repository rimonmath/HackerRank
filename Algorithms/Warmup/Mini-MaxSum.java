import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
       // long a = in.nextLong();
        //long b = in.nextLong();
        //long c = in.nextLong();
        //long d = in.nextLong();
        //long e = in.nextLong();
        
         long arr[] = new long[5];
        
        for(int i=0; i<5; i++){
           arr[i] = in.nextLong();
       }
        //arr[0] = a;
        //arr[1] = b;
        //arr[2] = c;
        //arr[3] = d;
        //arr[4] = e;
        
        
        long min =arr[0];
        long max = arr[0];
        long sum = 0;
        
        for(int i=0; i<5; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            
            if(arr[i]> max){
                max = arr[i];
            }
            
            sum += arr[i];
        }
        
        
       
        System.out.print((sum-max) + " " + (sum-min));       
        
        
    }
}
