import java.util.PriorityQueue;
import java.util.Comparator;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < n ;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        for(int num : freq.keySet()){
            pq.offer(num);
        }
        int ans[] = new int[k];
        for(int i = 0;i < k ;i++){
            ans[i] = pq.poll();
        }
        return ans;

    }
}