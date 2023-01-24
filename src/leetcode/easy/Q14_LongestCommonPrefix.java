package leetcode.easy;
import java.util.*;

public class Q14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // 첫번째 요소의 첫문자와 배열의 다른 요소들의 첫 문자와 비교한다. 같지 않은 경우가 나오면 빈문자열 리턴
        // 첫번째 요소의 두번째 문자와 배열의 다른 요소들의 두번째 문자와 비교. 같지 않은 경우가 나오면 첫번째 문자만 리턴
        // 첫번째 요소의 n번째 문자와 배열의 다른 요소들의 n번째 문자와 비교. 같지 않은 경우가 나오면 n-1번째 문자까지만 리턴

        // 배열을 길이순으로 오름차순으로 정렬해야한다.
        // 비교과정에서 첫번째 문자의 모든 문자를 탐색하면 그 즉시 종료하고 결과 리턴
        Arrays.sort(strs, (a, b) -> a.length() - b.length());
        //첫번째 요소
        String first = strs[0];
        boolean check = true;

        String result = "";
        int index = 0;
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (first.charAt(i) != strs[j].charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (!check) break;
            result += first.charAt(i);
        }
        return result;
    }


    //다른 풀이
    /*
        prefix를 배열의 첫 요소로 지정
        while문을 보면 prefix가 strs의 요소들에 포함되는지를 체크하고 있다.
        indexOf메소드로 나올 수 있는 경우는 0 또는 -1뿐이다. <- 첫 글자부터 비교를 하고 있기 때문에
        -1이 나오면 배열의 첫 요소를 포함하고 있지 않는 요소가 있다는 의미이므로
        prefix의 맨 마지막 문자를 제거하고 strs의 남은 요소들을
     */

    public String longestCommonPrefix1(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }


    // 다른 풀이
    /*
     Arrays.sort로 사전편찬순으로 정렬하면 가장 첫요소와 가장 마지막 요소가 가장 다른 문자가 된다.
     그러니 그 둘만 비교하면 빠르게 해결 가능하다.
     */
    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
