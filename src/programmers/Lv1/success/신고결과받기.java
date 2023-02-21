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

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        ArrayList<User> users = new ArrayList<>();
        HashMap<String,Integer> suspendedList = new HashMap<>(); //<이름>
        HashMap<String,Integer> idIdx = new HashMap<String,Integer>(); // <이름, 해당 이름의 User 클래스 idx>
        int idx = 0;

        for(String name : id_list) {
            idIdx.put(name,idx++);
            users.add(new User(name));
        }

        for(String re : report){
            String[] str = re.split(" ");
            //suspendedCount.put(str[0], suspendedCount.getOrDefault(str[0],0)+1);
            users.get( idIdx.get(str[0])).reportList.add(str[1]);
            users.get( idIdx.get(str[1])).reportedList.add(str[0]);
        }

        for(User user : users){
            if(user.reportedList.size() >= k)
                suspendedList.put(user.name,1);
        }

        for(User user : users){
            for(String nameReport : user.reportList){
                if(suspendedList.get(nameReport) != null){
                    answer[idIdx.get(user.name)]++;
                }

            }
        }




        return answer;
    }
}

class User{
    String name;
    HashSet<String> reportList;
    HashSet<String> reportedList;
    public User(String name){
        this.name = name;
        reportList = new HashSet<>();
        reportedList = new HashSet<>();
    }
}
