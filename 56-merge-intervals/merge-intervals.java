class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int st = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1;i < n;i++){
            if(intervals[i][0] <= end){
                end = Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(new int[]{st,end});
                st = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.add(new int[]{st,end});
        return ans.toArray(new int[ans.size()][]);
    }
}