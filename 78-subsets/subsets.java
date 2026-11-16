class Solution {
    public static void helper(List<List<Integer>> fans,List<Integer> ans,int nums[],int idx){
            if(nums.length == idx){
                fans.add(new ArrayList<>(ans));
                return;
            }
            if(true){
                ans.add(nums[idx]);
                helper(fans,ans,nums,idx+1);
                ans.remove(ans.size() -1);
            }
            helper(fans,ans,nums,idx+1);
        }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> fans = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(fans,ans,nums,0);
        return fans;
    }
}