import java.util.*;

public class LeadersInArray {

    public static List<Integer> leaders(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>max){
                result.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        List<Integer> result = leaders(nums);
        System.out.println(result);
    }
}