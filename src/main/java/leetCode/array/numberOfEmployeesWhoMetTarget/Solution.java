package leetCode.array.numberOfEmployeesWhoMetTarget;

/*
There are n employees in a company, numbered from 0 to n - 1.
Each employee i has worked for hours[i] hours in the company.
Return the integer denoting the number of employees who worked at least target hours.
 */
public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int n : hours) {
            if (n >= target) count++;
        }
        return count;
    }
}