// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     int[] ans = new int[2];
//                     ans[0] = i;
//                     ans[1] = j;
//                     return ans;
//                 }
//             }
//         }
//         return new int[0];
//     }
// }

// public class TwoSum {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int[] nums = {1, 6, 2, 10, 3};
//         int target = 7;
//         int[] ans = obj.twoSum(nums, target);
//         System.out.println("Indices: " + ans[0] + " " + ans[1]);
//     }
// }







// Optimall solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;

        int[] ans = obj.twoSum(nums, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}