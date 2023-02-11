package backjoon.implement.bronze;
import java.io.*;

public class Q1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();
            boolean yes = true;
            if(str.equals("0")) break;
            else {
                for(int i = 0; i<=str.length()/2; i++) {
                    if(str.charAt(i)!=(str.charAt(str.length()-i-1))) {
                        yes = false;
                        break;
                    }
                }
                if(yes) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
