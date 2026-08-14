class Solution {
    public int maximumLengthSubstring(String s) {   
        int arr[] = new int[26]; 
        int ans = 0;
        int left = 0;
        for(int i = 0 ;i < s.length() ;i++){
            arr[s.charAt(i) - 'a']++;
            while(arr[s.charAt(i) - 'a'] > 2){
                arr[s.charAt(left) - 'a']--;
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}