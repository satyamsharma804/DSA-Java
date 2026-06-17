public class Kadane_Algorithm {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        int ans = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum = " + ans);
    }
}