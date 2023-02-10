package backjoon.bruteforce.gold;
import java.io.*;
import java.util.*;

public class Q1107 {
    /**
     * 접근법
     * 1. 버튼이 고장났는지 안났는지 확인할 수 있는 boolean 배열을 만든다.
     * 2. 고장난 버튼은 true로 변경한다.
     * 3. 최대값이 999999이므로, 반복문으로 999999까지 탐색한다.
     * 4. i를 잘게 쪼개서 각 요소가 모두 false인지 확인한다.
     * 5. 모두 false라면 target-i의 절대값을 저장한다.
     * 6. 또 조건을 만족하는 i가 나오면 저장된 값과 target-i의 절대값을 비교해서 작은값을 저장한다.
     * 7. 최종적으로 target-100의 절대값과 저장된 값을 비교해서 작은값을 저장한다.
     * 8. 만약 target-100이 더 작으면 target-100을 출력하고
     * 9. 아니라면 저장된 값의 길이 + (target-i)의 절대값을 출력한다.
     */
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();
        int m = scan.nextInt();

        boolean[] broken = new boolean[10];
        for(int i = 0; i < m; i++) {
            int n = scan.nextInt();
            broken[n] = true;
        }

        int result = Math.abs(target - 100);
        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(broken[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }
            if(!isBreak) {
                int min = Math.abs(target - i) + len;
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}
