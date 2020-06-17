import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void prime(int num) {
        if (num == 1) {
            System.out.println("Not prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i+=1) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        int tests;
        Scanner sc = new Scanner(System.in);
        tests = sc.nextInt();
        
        int num = 0;
        while (tests-- != 0) {
            num = sc.nextInt();
            prime(num);
        }
        sc.close();
    }
}
