package programmers.Lv1.success;
import java.util.*;
public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            if(one[i%5]==ans) answer[0]++;
            if(two[i%8]==ans) answer[1]++;
            if(three[i%10]==ans) answer[2]++;
        }
        int[] result = {};
        if(answer[0]>answer[1] && answer[0]>answer[2]) result=new int[]{1};
        else if(answer[1]>answer[0]&& answer[1]>answer[2]) result =new int[]{2};
        else if(answer[2]>answer[0]&& answer[2]>answer[1]) result = new int[]{3};
        else if(answer[0]==answer[1]) result = new int[]{1,2};
        else if(answer[0]==answer[2]) result = new int[]{1,3};
        else if(answer[1]==answer[2]) result = new int[]{2,3};
        else result = new int[]{1,2,3};

        return result;

    }

    public static int[] solution1(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i]) list.add(i + 1);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
    }
}
