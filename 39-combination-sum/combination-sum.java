class Solution {
    public static void combination(List<List<Integer>> fans,List<Integer> ans,int[] cand,int target,int idx){
        if(target == 0){
            fans.add(new ArrayList<>(ans));
            return;
        }
        
        for(int i = idx;i < cand.length;i++){
            if(target < cand[i]) return;
            ans.add(cand[i]);
            combination(fans,ans,cand,target-cand[i],i);
            ans.remove(ans.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> fans = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        combination(fans,ans,candidates,target,0);
        return fans;
    }
}