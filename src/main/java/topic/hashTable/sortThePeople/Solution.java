package topic.hashTable.sortThePeople;

import java.util.Arrays;
import java.util.HashMap;

//given an array of strings names, and an array heights that consists of distinct positive integers
//Return names sorted in descending order by the people's heights
public class Solution {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int ind = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[ind] = map.get(heights[i]);
            ind++;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};
        String[] sortedNames = sortPeople(names, heights);
        System.out.println(Arrays.toString(sortedNames));

    }
}