package topic.math.convertTheTemperature;

import java.util.Arrays;

//You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
//You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit]
public class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32;
        double[] ans = {kelvin, fahrenheit};
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.convertTemperature(0);
    }
}