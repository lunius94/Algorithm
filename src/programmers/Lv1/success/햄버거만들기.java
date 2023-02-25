package programmers.Lv1.success;

public class 햄버거만들기 {
    public static void main(String[] args) {
        햄버거만들기 sol = new 햄버거만들기();

        int[] ingredient = {2,1,1,2,3,1,2,3,1};
        System.out.println(sol.solution1(ingredient));

    }
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i : ingredient) {
            sb.append(i);
        }
        String ingredients = sb.toString();
        String target = "1231";
        String[] temp;
        while(true) {
            temp = ingredients.split(target,2);
            String str = String.join("",temp);

            if(!str.equals(ingredients)) {
                answer++;
                ingredients = str;
            }
            else break;
        }
        return answer;
    }

    public int solution1(int[] ingredient) {
        int answer = 0;
        String temp = "";

        for(int i : ingredient) {
            temp += i;
            if(temp.length()<4) continue;
            if("1231".equals(temp.substring(temp.length()-4))) {
                answer++;
                if(temp.length() == 4) temp = "";
                else {
                    temp = temp.substring(0,temp.length()-4);
                }
            }

        }
        return answer;
    }

}
