package codeWars;

public class VowelCount {
    //Return the number (count) of vowels in the given string.
    //We will consider a, e, i, o, u as vowels for this Kata (but not y).
    //The input string will only consist of lower case letters and/or spaces.
    public static void main(String[] args) {
        getCount("o a kak ushakov lil vo kashu kakao");
    }

    public static int getCount(String str) {
        char[] chars = str.toCharArray();
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};

        int sum = 0;
        for (char aChar : chars) {
            for (char c : vowelsArray) {
                if (aChar == c) {
                    sum++;
                }
            }
        }
        return sum;
    }
}