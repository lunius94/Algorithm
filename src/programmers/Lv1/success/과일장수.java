package programmers.Lv1.success;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] scores = new int[10];
        for(int num : score) {
            scores[num]++;
        }

        for(int i = 9; i>0; i--) {
            int boxes = scores[i]/m;
            scores[i-1]+= scores[i]%m;
            answer += boxes*i*m;
        }

        return answer;
    }
}
