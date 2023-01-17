package programmers.Lv1.success;

import java.util.Arrays;
import java.util.Collections;

/*
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */


public class 문자열내림차순으로정렬하기 {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        String answer = String.join("",arr);
        return answer;
    }

    public String solution1(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String answer = new StringBuilder(new String(arr)).reverse().toString();
        return answer;
    }
}
