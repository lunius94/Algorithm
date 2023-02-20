package programmers.Lv1.success;

public class 숫자짝궁 {
    public String solution(String X, String Y) {
        String answer = "";
        int[] X_num = new int[10];
        int[] Y_num = new int[10];

        for(char c : X.toCharArray()) {
            X_num[c-'0']++;
        }
        for(char c : Y.toCharArray()) {
            Y_num[c-'0']++;
        }
        for(int i = 9; i>=0; i--) {

            int repeat = Math.min(X_num[i],Y_num[i]);
            if(i==0&&answer.length()==0) {
                answer += String.valueOf(i).repeat(repeat);
                if(answer.length()!=0) answer = "0";
                break;
            }
            answer += String.valueOf(i).repeat(repeat);
        }
        return answer.length()==0? "-1":answer;
    }

    public String solution1(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] X_num = new int[10];
        int[] Y_num = new int[10];

        for(char c : X.toCharArray()) {
            X_num[c-'0']++;
        }
        for(char c : Y.toCharArray()) {
            Y_num[c-'0']++;
        }
        for(int i = 9; i>=0; i--) {
            int repeat = Math.min(X_num[i],Y_num[i]);
            sb.append(String.valueOf(i).repeat(repeat));
        }
        if(sb.toString().startsWith("0")) return "0";
        else if(sb.toString().length()==0) return "-1";
        else return sb.toString();
    }
}
