package leetCode.math.calculateDelayedArrivalTime;

//You are given a positive integer arrivalTime denoting the arrival time of a train in hours, and another positive integer delayedTime denoting the amount of delay in hours.
//Return the time when the train will arrive at the station.
public class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int delayedArrivalTime = arrivalTime + delayedTime;
        if (delayedArrivalTime < 24) {
            return delayedArrivalTime;
        } else {
            delayedArrivalTime = (arrivalTime + delayedTime) - 24;
            return delayedArrivalTime;
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int result = s1.findDelayedArrivalTime(5, 3);
        System.out.println(result);
    }
}