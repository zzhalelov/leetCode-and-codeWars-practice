package topic.math.integerToRoman;

//Given an integer, convert it to a roman numeral
public class Solution {
    public String intToRoman(int num) {
        // Задаем таблицу соответствия для римских цифр
        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        // Проходим по таблице соответствия и добавляем соответствующие символы в римское представление числа
        for (int i = 0; i < arabicValues.length; i++) {
            while (num >= arabicValues[i]) {
                roman.append(romanSymbols[i]);
                num -= arabicValues[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.intToRoman(1994));
    }
}