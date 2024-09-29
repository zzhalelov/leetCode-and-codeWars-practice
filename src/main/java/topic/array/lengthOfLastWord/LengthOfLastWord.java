package topic.array.lengthOfLastWord;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        String[] strArray = trimmedString.split(" ");
        int result = 0;
        for (int i = 0; i < strArray.length; i++) {
            String string = strArray[strArray.length - 1];
            result = string.length();
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}