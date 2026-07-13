class Solution {
    public int[] sortByBits(int[] arr) {
        Integer aa[] = new Integer[arr.length];
        for(int i = 0;i < arr.length ;i++){
            aa[i] = arr[i];
        }
        Arrays.sort(aa ,(a,b) -> {
            int bita = Integer.bitCount(a);
            int bitb = Integer.bitCount(b);
            if(bita != bitb) return bita - bitb;
            return a - b;
        });
        for(int i = 0;i < arr.length ;i++){
            arr[i] = aa[i];
        }
        return arr;
    }
}