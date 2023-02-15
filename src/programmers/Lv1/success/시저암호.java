package programmers.Lv1.success;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        int cur = 0;
        for(char c : chars) {
            if(String.valueOf(c).matches("[a-z]")) {
                cur = c+n>'z'? c+n-26:c+n;
                answer+=(char)cur;
            }
            else if(String.valueOf(c).matches("[A-Z]")) {
                cur = c+n>'Z'? c+n-26:c+n;
                answer+=(char)cur;
            }
            else {
                answer += c;
            }

        }
        return answer;
    }
}
