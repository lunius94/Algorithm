package backjoon.String;
import java.io.*;

public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int time = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='W') {
                time += 10;
            }
            else if(c>='T') time += 9;
            else if(c>='P') time += 8;
            else if(c>='M') time += 7;
            else if(c>='J') time += 6;
            else if(c>='G') time += 5;
            else if(c>='D') time += 4;
            else if(c>='A') time += 3;
        }
        System.out.println(time);
    }
}
