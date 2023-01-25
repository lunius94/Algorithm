package backjoon.sorting;
import java.io.*;

public class Q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] counting = new int[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > counting.length - 1) {
                int[] newCounting = new int[arr[i] + 1];
                System.arraycopy(counting, 0, newCounting, 0, counting.length);
                counting = newCounting;
            }
            counting[arr[i]]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            counting[arr[i]]--;
            int index = counting[arr[i]];
            result[index] = arr[i];
        }
        arr = result;


        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
