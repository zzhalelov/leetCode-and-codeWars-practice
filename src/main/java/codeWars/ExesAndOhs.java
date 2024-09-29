package codeWars;

public class ExesAndOhs {
    public static boolean getXO(String str) {
        // Good Luck!!
        char[] chars = str.toCharArray();
        int sumO = 0;
        int sumX = 0;
        for (char ch : chars) {
            if (ch == 'o' || ch == 'O') {
                sumO++;
            } else if (ch == 'x' || ch == 'X') {
                sumX++;
            }
        }
        return sumO == sumX;
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxXm"));
    }
}
