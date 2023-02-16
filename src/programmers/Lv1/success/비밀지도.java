package programmers.Lv1.success;

// 2진법으로 바꿀 수 있다는거 잊지말자..
public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<arr1.length; j++) {
                int num = (int) Math.pow(2,i);
                String str = "#";
                if(arr1[j]/num==0 && arr2[j]/num==0) str =" ";
                if(answer[j]==null) answer[j] = str;
                else answer[j]+= str;
                arr1[j]%=num;
                arr2[j]%=num;
            }
        }
        return answer;
    }

    //다른사람의 풀이
    public String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++){
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            temp = temp.substring(temp.length() - n);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }
}
