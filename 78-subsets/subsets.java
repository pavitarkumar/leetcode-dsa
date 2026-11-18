class Solution {
    public static void helper(List<List<Integer>> fans,List<Integer> ans,int[] n,int idx){
        if(idx == n.length){
            fans.add(new ArrayList<>(ans));
            return;
        }
        helper(fans,ans,n,idx+1);
        ans.add(n[idx]);
        helper(fans,ans,n,idx+1);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> fans = new ArrayList<>();
        helper(fans,ans,nums,0);
        return fans;
    }
}