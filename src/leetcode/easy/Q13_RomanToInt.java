package leetcode.easy;

import java.util.*;

public class Q13_RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int sum = 0;
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) sum += map.get(arr[i]);
            else if (map.get(arr[i]) < map.get(arr[i + 1])) sum -= map.get(arr[i]);
            else sum += map.get(arr[i]);
        }
        return sum;
    }

    // 다른 사람의 풀이
    public int romanToInt1(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}
