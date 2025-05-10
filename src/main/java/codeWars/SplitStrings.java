package codeWars;

//https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
//Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters
// then it should replace the missing second character of the final pair with an underscore ('_').
public class SplitStrings {
    public static String[] solution(String s) {
        if (s.isEmpty()) {
            return new String[0];
        }

        if (s.length() % 2 != 0) {
            s += "_";
        }

        String[] result = new String[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            result[i / 2] = s.substring(i, i + 2);
        }

        return result;
    }
}