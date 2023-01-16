package programmers.Lv1.success;

import java.util.stream.IntStream;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int countP = 0;
        int countY = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)=='p') countP++;
            if(s.charAt(i)=='y') countY++;
        }
        if(countP==countY) return true;
        return false;
    }

    public static void main(String[] args) {
    }
}


