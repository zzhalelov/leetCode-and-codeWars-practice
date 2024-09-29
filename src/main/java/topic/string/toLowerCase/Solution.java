package topic.string.toLowerCase;

//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter
public class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.toLowerCase("PayPal"));
    }
}