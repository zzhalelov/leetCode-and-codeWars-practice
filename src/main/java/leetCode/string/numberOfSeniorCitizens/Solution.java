package leetCode.string.numberOfSeniorCitizens;
//You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
//The first ten characters consist of the phone number of passengers
//The next character denotes the gender of the person
//The following two characters are used to indicate the age of the person
//The last two characters determine the seat allotted to that person
//Return the number of passengers who are strictly more than 60 years old
public class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String temp : details) {
            if (((temp.charAt(11) - '0') * 10) + (temp.charAt(12) - '0') > 60)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int count = solution.countSeniors(details);
        System.out.println("Number of passengers over 60: " + count);
    }
}