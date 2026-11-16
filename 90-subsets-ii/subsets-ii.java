class Solution {
    public static void solve(int idx,int nums[],List<Integer> ans,List<List<Integer>> fans,boolean flag){
        if(nums.length == idx){
            fans.add(new ArrayList<>(ans));
            return;
        }
        int f = nums[idx];
        if(idx < nums.length - 1 && f == nums[idx+1]){
            if(flag){
                ans.add(f);
                solve(idx+1,nums,ans,fans,true);
                ans.remove(ans.size() - 1);
            } 
            solve(idx+1,nums,ans,fans,false);

        }else{
            if(flag){
                ans.add(f);
                solve(idx+1,nums,ans,fans,true);
                ans.remove(ans.size() - 1);
            } 
            solve(idx+1,nums,ans,fans,true);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> fans = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(0,nums,ans,fans,true);
        return fans;
    }
}