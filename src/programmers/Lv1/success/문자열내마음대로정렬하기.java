package programmers.Lv1.success;
import java.util.*;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings,
                (a,b)->a.charAt(n)==b.charAt(n)? a.compareTo(b):a.charAt(n)-b.charAt(n));
        return strings;
    }
}
