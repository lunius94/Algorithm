package programmers.Lv1.success;

import java.util.*;

public class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> deleteFileList = new ArrayList<>();
        Map<String, Integer> termsMap = new HashMap<>();
        for(int i = 0; i < terms.length; i++) {
            String[] termsArray = terms[i].split(" ");
            termsMap.put(termsArray[0],Integer.valueOf(termsArray[1]));
        }

        for(int i = 0; i < privacies.length; i++) {
            String[] privaciesArray = privacies[i].split(" ");
            if(isDeleteFile(today, privaciesArray[0],termsMap.get(privaciesArray[1]))) {
                deleteFileList.add(i + 1);
            }
        }
        int[] answer = new int[deleteFileList.size()];
        for(int i = 0; i < deleteFileList.size(); i++) {
            answer[i] = deleteFileList.get(i);
        }
        return answer;
    }

    private boolean isDeleteFile(String today, String date, int terms) {
        String[] todayArray = today.split("\\.");
        String[] dateArray = date.split("\\.");
        int year = Integer.parseInt(dateArray[0]) + terms/12;
        int month = Integer.parseInt(dateArray[1]) + terms%12;
        int day = Integer.parseInt(dateArray[2]) - 1;

        if(month > 12) {
            month -= 12;
            year += 1;
        }
        if(day == 0) {
            month -= 1;
            if(month == 0) {
                month = 12;
                year -= 1;
            }
            day = 28;
        }

        if(year < Integer.parseInt(todayArray[0])) {
            return true;
        }
        else if(year > Integer.parseInt(todayArray[0])) {
            return false;
        }
        else if(month < Integer.parseInt(todayArray[1])) {
            return true;
        }
        else if(month > Integer.parseInt(todayArray[1])) {
            return false;
        }
        else if(day < Integer.parseInt(todayArray[2])) {
            return true;
        }
        else {
            return false;
        }
    }
}
