package programmers.Lv1.success;
import java.util.*;
import java.util.stream.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        boolean[][] isReport = new boolean[id_list.length][id_list.length];
        for(int i = 0; i < report.length; i++) {
            String[] arr = report[i].split(" ");
            isReport[returnIndex(id_list,arr[0])][returnIndex(id_list,arr[1])] = true;
        }

        for(int i = 0; i < id_list.length; i++) {
            int reportCount = 0;
            for(int j = 0; j < id_list.length; j++) {
                if(isReport[j][i]) reportCount++;
            }
            if(reportCount>=k) {
                for(int j = 0; j <id_list.length; j++) {
                    if(isReport[j][i]) answer[j]++;
                }
            }
        }

        return answer;
    }

    public int returnIndex (String[] id_list, String s) {
        for(int i = 0; i < id_list.length; i++) {
            if(id_list[i].equals(s)) return i;
        }
        return -1;
    }

    public int[] solution1(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list)
                .map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        })
                .mapToInt(Long::intValue)
                .toArray();
    }
}
