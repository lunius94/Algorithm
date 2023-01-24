package backjoon.String;
import java.io.*;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replace("c=","c").replace("c-","c").replace("dz=","d")
                .replace("d-","d").replace("lj","l").replace("nj","n")
                .replace("s=","s").replace("z=","z");
        System.out.println(str.length());
    }
}
