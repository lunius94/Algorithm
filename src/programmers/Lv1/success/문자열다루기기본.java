package programmers.Lv1.success;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if (length !=4 && length != 6) answer = false;
        else {
            answer = s.matches("^\\d{4,6}$");
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열다루기기본 sol = new 문자열다루기기본();

        boolean solution = sol.solution("123456" );
        System.out.println(solution);
    }
}
