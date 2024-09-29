package codeWars;

public class DotCalculator {
    public static String calc(String txt) {
        //Code here
        char[] operators = {'+', '-', '*', '/'};
        char[] chars = txt.toCharArray();
        int indexOfOperator = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < operators.length; j++) {
                if (chars[i] == operators[j]) {
                    indexOfOperator = i;
                }
            }
        }

        int dotsBeforeOperator = 0;
        for (int i = 0; i < indexOfOperator; i++) {
            if (chars[i] == '.') {
                dotsBeforeOperator++;
            }
        }

        int dotsAfterOperator = 0;
        for (int i = indexOfOperator; i < chars.length; i++) {
            if (chars[i] == '.') {
                dotsAfterOperator++;
            }
        }

        int res = 0;
        switch (chars[indexOfOperator]) {
            case '+':
                res = dotsBeforeOperator + dotsAfterOperator;
                break;
            case '-':
                res = dotsBeforeOperator - dotsAfterOperator;
                break;
            case '*':
                res = dotsBeforeOperator * dotsAfterOperator;
                break;
            case '/':
                res = dotsBeforeOperator / dotsAfterOperator;
                break;
            default:
                throw new IllegalArgumentException("Неправильный оператор");
        }
        String result = ".".repeat(res);
        return result;
    }

    public static void main(String[] args) {
        String txt = "..... + ...............";
        calc(txt);
    }
}
