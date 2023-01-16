package leetcode.easy;

public class Q9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = x+"";
        for(int i = 0; i<=str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }

    //풀이 1
    // 시간복잡도 O(n)
    // 공간복잡도 O(1)
    public boolean IsPalindrome1(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
