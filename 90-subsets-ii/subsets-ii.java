class Solution {
    public static void helper(List<List<Integer>> fans,List<Integer> ans,int[] n,int idx,boolean flag){
        if(idx == n.length){
            fans.add(new ArrayList<>(ans));
            return;
        }
        int v = n[idx];
        if(idx < n.length-1 && v == n[idx+1]){
            if(flag) helper(fans,ans,n,idx+1,true);
            ans.add(v);
            helper(fans,ans,n,idx+1,false);
            ans.remove(ans.size()-1);
        }else{
            if(flag)helper(fans,ans,n,idx+1,true);
            ans.add(v);
            helper(fans,ans,n,idx+1,true);
            ans.remove(ans.size()-1);
        }  
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> fans = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int idx = 0;
        helper(fans,ans,nums,idx,true);
        return fans;
    }
}