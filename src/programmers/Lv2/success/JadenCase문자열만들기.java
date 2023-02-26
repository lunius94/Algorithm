package programmers.Lv2.success;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split(" ", -1);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")) continue;
            else if(arr[i].length() == 1) arr[i] = arr[i].toUpperCase();
            else {
                arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
            }
        }
        answer = String.join(" ",arr);
        return answer;
    }
}
