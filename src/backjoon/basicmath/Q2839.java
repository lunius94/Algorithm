package backjoon.basicmath;
import java.io.*;

public class Q2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int a = N/5;
        int b = N%5-5;
        while(a>=0) {
            b+=5;
            if(b%3==0){
                break;
            }
            else {
                a--;

            }
        }
        int result = b%3==0? a+b/3 : -1;
        System.out.println(result);
    }
}
