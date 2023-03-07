package programmers.Lv2.success;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        int root = (int) Math.sqrt(total);
        for(int i = 1; i<=root; i++) {
            if(total%i==0) {
                int temp = (i+total/i)*2-4;
                if(brown == temp) {
                    answer[0] = total/i;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}
