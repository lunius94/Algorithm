package leetcode.easy;

import java.util.*;

public class Q1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = nums.length-1; j>=0; j--) {
                if(i==j) break;
                if (nums[i]+nums[j]==target) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
            if(answer[1]!=0) break;
        }
        return answer;
    }

    // 풀이 1
    // 시간복잡도 O(n^2)
    // 공간복잡도 O(1)
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    //풀이 2
    //시간복잡도 O(N)
    //공간복잡도 O(N)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    //풀이3
    //시간복잡도 O(n)
    //공간복잡도 O(n)
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
