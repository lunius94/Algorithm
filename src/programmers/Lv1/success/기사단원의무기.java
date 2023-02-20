package programmers.Lv1.success;

public class 기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int root = (int) Math.sqrt(i);
            int count = 0;
            for(int j = 1; j<=root; j++){
                if(i%j==0) count++;
            }
            if(Math.pow(root,2)==i) count = count*2-1;
            else count *=2;

            if(count>limit) count = power;
            answer += count;
        }
        return answer;
    }
}
