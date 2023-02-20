package programmers.Lv1.success;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        int diff = 0;
        for(int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            for(int j = i; j<s.length(); j++) {
                if(s.charAt(j)==target) diff++;
                else diff--;
                if(j==s.length()-1 || diff==0) {
                    answer++;
                    i=j;
                    break;
                }
            }
        }
        return answer;
    }
}
