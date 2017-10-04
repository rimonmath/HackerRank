import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double ps  = 0;
        double ns = 0;
        double zs = 0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if(arr[arr_i] >0){
                ps += 1;                
            } else if(arr[arr_i] < 0){
                ns += 1;                
            } else{
                zs +=1;
            }
        }
        
        System.out.println(ps / n);
        System.out.println(ns / n);
        System.out.println(zs / n);
    }
}
