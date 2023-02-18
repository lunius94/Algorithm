package programmers.Lv1.success;
import java.io.*;
import java.util.*;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] location = new int[26];
        Arrays.fill(location,-1);
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i)-'a';
            if(location[index]==-1) {
                answer[i] = -1;
                location[index] = i;
            }
            else {
                answer[i] = i-location[index];
                location[index] = i;
            }
        }
        return answer;
    }


    public int[] solution1(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}
