import java.util.ArrayList;
import java.util.List;
class Solution {
    public static void helper(int []nums,List<Integer> ans,List<List<Integer>> fans ,int idx){
        if(idx == nums.length){
            fans.add(new ArrayList<>(ans));
            return;
        }
        helper(nums,ans,fans,idx+1);
        ans.add(nums[idx]);
        helper(nums,ans,fans,idx+1);
        ans.remove(ans.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> fans = new ArrayList<>();
        helper(nums,ans,fans,0);
        return fans;
    }
}