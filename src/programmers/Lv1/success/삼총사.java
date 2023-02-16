package programmers.Lv1.success;

public class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        int length = number.length;
        for(int i = 0; i < length; i++) {
            for(int j = i+1; j<length; j++) {
                for(int k = j+1; k<length; k++) {
                    int sum = number[i]+number[j]+number[k];
                    if(sum==0) answer++;
                }
            }
        }
        return answer;
    }
}
