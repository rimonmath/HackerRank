import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        
        int l = 0;
        int r = 0;
        
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
                if(i == j){
                    l += a[i][j];
                }
                
                if( j == (n-i) -1){
                    r += a[i][j];
                }                
            }
        }
        
        int result = l>r? l-r: r-l;
        
        System.out.print(result);
        
    }
}
