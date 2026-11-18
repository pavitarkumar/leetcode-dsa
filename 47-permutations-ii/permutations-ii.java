class Solution {
    public static void helper(List<List<Integer>> fans,List<Integer> ans,int []nums,boolean arr[]){
        if(ans.size() == nums.length){
            fans.add(new ArrayList<>(ans));
            return;
        }
        for(int i = 0;i < nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1] && arr[i - 1]==true) continue;
            if(arr[i]) continue;
            arr[i] = true;
            ans.add(nums[i]);
            helper(fans,ans,nums,arr);
            ans.remove(ans.size() - 1);
            arr[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);    
        boolean arr[] = new boolean[nums.length];
        List<List<Integer>> fans = new ArrayList<>();
        helper(fans,new ArrayList<>(),nums,arr);
        return fans;
    }
}