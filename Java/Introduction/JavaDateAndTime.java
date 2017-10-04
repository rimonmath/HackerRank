import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = Integer.parseInt(in.next()) -1;
        int day = Integer.parseInt(in.next()) ;
        int year = Integer.parseInt(in.next());
        in.close();
        
        //System.out.println(month + "-" + day + "-" + year);
        
        Calendar cal = Calendar.getInstance();
        //calendar.set(Calendar.YEAR, year);
        //calendar.set(Calendar.MONTH, month);
       // calendar.set(Calendar.DAY, day);
        cal.set(year, month, day);
       // System.out.println(cal.get(cal.DAY_OF_WEEK));
        
        SimpleDateFormat formatter = new SimpleDateFormat("EEEEEE");
        String text = formatter.format(cal.getTime());
        
        System.out.println(text.toUpperCase());
        
    }
}
