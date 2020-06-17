import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh) {
        Map <String, Integer> phones = new HashMap();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phones.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (phones.containsKey(s)) {
                System.out.println(s + "=" + phones.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}

