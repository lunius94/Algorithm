package backjoon.string;
import java.io.*;
import java.util.Arrays;
// 입력 문자열이 " " 인경우(공백인경우)에 엣지 케이스

public class Q1152 {
    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine().trim();
//
//        if(str.equals(" ")) System.out.println(0);
//        else {
//            str = str.trim();
//            String[] arr = str.split(" ");
//            System.out.println(arr.length);
//        }

        String str = " a b c d e f g h i j k   ";
        String[] s1 = str.split(" ");
        String[] s2 = str.split(" ", 3);
        String[] s3 = str.split(" ", 0);
        String[] s4 = str.split(" ", -1);
        String[] s5 = str.split(" ", -3);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        System.out.println(Arrays.toString(s3));
        System.out.println(Arrays.toString(s4));
        System.out.println(Arrays.toString(s5));

    }
}
