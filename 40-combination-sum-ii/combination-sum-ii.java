class Solution {
    public static void helper(List<List<Integer>> fans,List<Integer> ans,int[] cand, int target,int idx){
        if(target == 0){
            fans.add(new ArrayList<>(ans));
            return;
        }
        for(int i = idx;i < cand.length;i++){
            if(i > idx && cand[i] == cand[i-1]) continue;
            if(target < cand[i]) break;
            
            ans.add(cand[i]);
            helper(fans,ans,cand,target-cand[i],i+1);
            ans.remove(ans.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> fans = new ArrayList<>();
        helper(fans,ans,candidates,target,0);
        return fans;
    }
}