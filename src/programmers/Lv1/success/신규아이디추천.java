package programmers.Lv1.success;
import java.util.regex.Pattern;

public class 신규아이디추천 {
    public static void main(String[] args) {
        신규아이디추천 sol = new 신규아이디추천();
        String new_id = "2-.^";
        System.out.println(sol.solution(new_id));
        System.out.println(new_id);
    }

    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();

        answer=answer.replaceAll("[^a-z0-9-_.]","");
        answer=answer.replaceAll("[.]{2,}",".");
        answer=answer.replaceAll("^[.]|[.]$","");

        if(answer.equals("")) answer = "a";

        if(answer.length()>=16) answer=answer.substring(0,15);
        answer = answer.replaceAll("[.]$","");

        while(answer.length()<3) {
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }
}
