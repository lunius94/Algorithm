package programmers.Lv1.success;

public class 가운데글자가져오기 {
    public String solution(String s) {
        int halfLength = s.length()/2;
        return s.length()%2==0? s.substring(halfLength-1,halfLength+1) : s.substring(halfLength,halfLength+1);
    }
}
