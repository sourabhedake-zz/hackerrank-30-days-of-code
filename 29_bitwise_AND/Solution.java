import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int max = 0;
            int tmp = 0;
            for (int i = 1; i <= n - 1; i++) {
                for (int j = i + 1; j <= n; j++) {
                    tmp = i & j;
                    if (tmp > max && tmp < k) {
                        max = tmp;
                    }
                }
            }
            System.out.println(max);
        }

        scanner.close();
    }
}
