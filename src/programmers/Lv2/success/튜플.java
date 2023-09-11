package programmers.Lv2.success;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 튜플 {
    public static int[] solution(String s) {
        int[] answer = {};

        List<String> strs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < s.length()-1; i++) {
            String target = s.substring(i,i+1);
            if(target.equals("{")) {
                continue;
            }
            else if (target.equals("}")) {
                strs.add(sb.toString());
                sb = new StringBuilder();
                i++;
            }
            else {
                sb.append(target);
            }
        }

        strs.sort(Comparator.comparingInt(String::length));

        answer = new int[strs.size()];

        Set<String> hashSet = new HashSet<>();

        for(int i = 0; i < answer.length; i++) {
            String[] split = strs.get(i).split(",");
            int tmpSize = hashSet.size();
            for(int j = 0; j < split.length; j++) {
                hashSet.add(split[j]);
                if(hashSet.size() != tmpSize) {
                    answer[i] = Integer.valueOf(split[j]);
                    break;
                }
            }
        }
        return answer;
    }

    public int[] solution2(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }

    public int[] solution3(String s) {

        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String n = matcher.group();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int size = map.size();
        int[] answer = new int[size];
        for (String key: map.keySet()) {
            answer[size - map.get(key)] = Integer.parseInt(key);
        }
        return answer;
    }
}
