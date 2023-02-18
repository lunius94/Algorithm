package programmers.Lv1.success;

public class 푸드파이트대회 {
    public String solution(int[] food) {
        StringBuilder sb1 = new StringBuilder();
        int len = food.length;
        for(int i = 1; i < len; i++) {
            sb1.append(String.valueOf(i).repeat(food[i]/2));
        }
        StringBuilder sb2 = new StringBuilder(sb1);
        String answer = sb1.append(0).append(sb2.reverse()).toString();
        return answer;
    }
}
