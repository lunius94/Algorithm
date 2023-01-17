package programmers.Lv1.success;

import java.util.Arrays;
import java.util.List;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        int index=0;
        for(int i = 0; i< seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        return String.format("김서방은 %d에 있다",index);
    }

    public String solution1(String[] seoul) {
        List<String> list = Arrays.asList(seoul);
        return String.format("김서방은 %d에 있다", list.indexOf("Kim"));
    }
}
