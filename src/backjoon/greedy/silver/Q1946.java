package backjoon.greedy.silver;
import java.io.*;
import java.util.*;
public class Q1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        while(TC-->0) {
            int N = Integer.parseInt(br.readLine());
            Score[] arr = new Score[N];
            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i] = new Score(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            }
            Arrays.sort(arr,(a,b)-> a.getScore1()-b.getScore1());

            int count = 1;
            int min_score2 = arr[0].getScore2();
            for(int i = 1; i<N; i++) {
                if(min_score2>arr[i].getScore2()) {
                    count++;
                    min_score2= arr[i].getScore2();
                }
            }
            System.out.println(count);
        }
    }

    static class Score{
        private int score1;
        private int score2;

        public Score(int score1, int score2) {
            this.score1 = score1;
            this.score2 = score2;
        }

        public int getScore1() {
            return score1;
        }
        public int getScore2() {
            return score2;
        }
    }
}
