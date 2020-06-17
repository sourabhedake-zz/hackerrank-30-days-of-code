import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int d1, m1, y1;
        int d2, m2, y2;
        int hackos = 0;

        Scanner scan = new Scanner (System.in);
        d2 = scan.nextInt();
        m2 = scan.nextInt();
        y2 = scan.nextInt();
       
        d1 = scan.nextInt();
        m1 = scan.nextInt();
        y1 = scan.nextInt();
       
        if (y2 > y1) {
            hackos = 10000;
        }
        else if (y2 == y1 && m2 > m1) {
            hackos = 500 * (m2 - m1);
        }
        else if (y2 == y1 && m2 == m1 && d2 > d1) {
            hackos = 15 * (d2 - d1);
        }
        System.out.println(hackos);
    }
}

