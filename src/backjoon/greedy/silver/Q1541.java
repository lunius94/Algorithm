package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q1541 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringBuilder sb = new StringBuilder();
//        int sum = 0;
//        boolean check = true;
//        for(int i =0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if(i==0 && c =='-') check = false;
//            if(check) {
//                if(c=='+') {
//                    sum += Integer.parseInt(sb.toString());
//                    sb.delete(0,sb.length());
//                }
//                else if(c=='-') {
//                    check = false;
//                    sum += Integer.parseInt(sb.toString());
//                    sb.delete(0,sb.length());
//                }
//                else {
//                    sb.append(c);
//                }
//            }
//            else {
//                if(c=='+' || c=='-') {
//                    sum -= Integer.parseInt(sb.toString());
//                    sb.delete(0,sb.length());
//                }
//                else {
//                    sb.append(c);
//                }
//            }
//        }
//        sum += check? Integer.parseInt(sb.toString()):-Integer.parseInt(sb.toString());
//        System.out.println(sum);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer substraction = new StringTokenizer(br.readLine(),"-");
        int sum = Integer.MAX_VALUE;

        while(substraction.hasMoreTokens()) {
            int temp = 0;


            StringTokenizer addition = new StringTokenizer(substraction.nextToken(),"+");
            while(addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }

            if(sum==Integer.MAX_VALUE) {
                sum = temp;
            }
            else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
