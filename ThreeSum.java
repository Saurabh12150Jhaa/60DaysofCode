import java.util.Arrays;
import java.util.*;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int j = i + 1, k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++; k--;
                    } else if (sum < 0) j++;
                    else k--;
                }
            }
            return res;
        }
        public static void main(String[] args) { 
            ThreeSum sol = new ThreeSum(); 
            int[] nums = {-1, 0, 1, 2, -1, -4}; 
            List<List<Integer>> res = sol.threeSum(nums); 
            System.out.println(res); 
        }
}
