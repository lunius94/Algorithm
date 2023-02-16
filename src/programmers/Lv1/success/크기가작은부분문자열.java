package programmers.Lv1.success;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        for (int i = length; i<=t.length(); i++) {
            String str = t.substring(i-length,i);
            if(str.compareTo(p)<=0) answer++;
        }
        return answer;
    }
}
