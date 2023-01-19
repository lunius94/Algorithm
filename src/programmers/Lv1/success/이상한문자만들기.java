package programmers.Lv1.success;

import java.util.Arrays;

public class 이상한문자만들기 {

    public String solution(String s) {
        String[] arr = s.split(" ",-1);
        for(int i = 0; i<arr.length; i++) {
            String str ="";
            for(int j = 0; j<arr[i].length(); j++) {
                if(j%2==0) str += arr[i].substring(j,j+1).toUpperCase();
                else str+= arr[i].substring(j,j+1).toLowerCase();
            }
            arr[i] = str;
        }
        return String.join(" ",arr);
    }
}
