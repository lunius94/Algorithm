package algorithm.sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        Insertionsort sol = new Insertionsort();
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        arr = sol.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 시간복잡도 O(N^2)
     * 오름차순 정렬
     * @param arr
     * @return
     */
    public int[] insertionSort(int[] arr) {
        for(int index = 1; index < arr.length; index++) {
            for(int target = index; target>0; target--) {
                if(arr[target-1]>arr[target]) {
                    int temp = arr[target];
                    arr[target] = arr[target-1];
                    arr[target-1] = temp;
                }
                else break;
            }
        }
        return arr;
    }


}
