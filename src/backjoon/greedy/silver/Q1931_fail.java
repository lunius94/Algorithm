package backjoon.greedy.silver;
import java.io.*;
import java.util.*;

public class Q1931_fail {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

		/*
		  time[][0] 은 시작시점을 의미
		  time[][1] 은 종료시점을 의미
		*/
        Integer[][] time = new Integer[N][2];

        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());	// 시작시간
            time[i][1] = Integer.parseInt(st.nextToken());	// 종료시간
        }


        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time,(a,b)->a[1].equals(b[1])? a[0]-b[0]:a[1]-b[1]);

        int count = 0;
        int prev_end_time = 0;

        for(int i = 0; i < N; i++) {

            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if(prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
