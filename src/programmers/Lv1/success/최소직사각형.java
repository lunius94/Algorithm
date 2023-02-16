package programmers.Lv1.success;
import java.util.*;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];

        for(int i = 0; i< sizes.length; i++) {
            width[i] = Math.max(sizes[i][0],sizes[i][1]);
            height[i] = Math.min(sizes[i][0],sizes[i][1]);
        }

        Arrays.sort(width);
        Arrays.sort(height);

        return width[width.length-1]*height[height.length-1];
    }

}
