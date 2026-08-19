class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int arr[] : reservedSeats){
            int row = arr[0];
            int seatNo = arr[1];
            map.putIfAbsent(row,new HashSet<>());
            map.get(row).add(seatNo);
        }
        int ans = (n - map.size()) * 2;
        for(Set<Integer> r : map.values()){
            boolean l = !r.contains(2) && !r.contains(3) && !r.contains(4) && !r.contains(5);
            boolean m = !r.contains(4) && !r.contains(5) && !r.contains(6) && !r.contains(7);
            boolean ri = !r.contains(6) && !r.contains(7) && !r.contains(8) && !r.contains(9);
            if(l && ri){
            ans += 2;
        }else if(l || m || ri){
            ans += 1;
        }
        }
        
        return ans;
    }
}