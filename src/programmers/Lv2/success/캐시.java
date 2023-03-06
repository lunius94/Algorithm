package programmers.Lv2.success;
import java.util.*;

/**
 * LinkedList로도 해보자.
 */
public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(String city : cities) {
            city = city.toLowerCase();
            if(list.contains(city)) {
                answer+=1;
                list.remove(city);
                list.add(city);
            }
            else {
                list.add(city);
                answer+=5;
                if(list.size()>cacheSize) {
                    list.remove(0);
                }
            }
        }
        return answer;
    }
}
