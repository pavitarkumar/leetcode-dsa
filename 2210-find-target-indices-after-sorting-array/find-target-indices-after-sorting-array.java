import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int l = nums.length;
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList();
        for(int i = 0;i < l ;i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}