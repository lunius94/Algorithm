package backjoon.sorting;
import java.io.*;

public class Q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] counting = new int[8001];
        double sum = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+= arr[i];
            counting[arr[i]+4000]++;
        }
        int average = (int) Math.round(sum/N);
        sb.append(average).append("\n");

        int max = counting[0];
        int index = 0;
        int secondIndex = 0;
        boolean check = true;
        for(int i = 1; i < counting.length; i++) {
            if(counting[i]>max){
                max = counting[i];
                index = i;
                check=true;
            }
            else if(counting[i]==max && check) {
                secondIndex = i;
                check = false;
            }
            counting[i] += counting[i-1];
        }
        index = Math.max(index,secondIndex);

        int[] newArr = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--) {
            counting[arr[i]+4000]--;
            int idx = counting[arr[i]+4000];
            newArr[idx] = arr[i];
        }
        arr = newArr;

        int mid = arr[N/2];
        int mode = index-4000;
        int range = arr[arr.length-1]-arr[0];
        sb.append(mid).append("\n").append(mode).append("\n").append(range);
        System.out.println(sb.toString());
    }
}
