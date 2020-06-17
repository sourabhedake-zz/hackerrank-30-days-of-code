import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static String binary(int n) {
        String bin = "";
        while (n != 0) {
            bin += n%2;
            n=n/2;
        }
        return bin;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String bin = binary(n);
        int max = 0;
        int cur = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                cur++;
            }
            else {
                if (max < cur) {
                    max = cur;
                }
                cur = 0;
            }
        }
        if (max < cur) {
            max = cur;
        }
        System.out.println (max);
    }
}
