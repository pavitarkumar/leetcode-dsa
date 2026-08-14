class Solution {
    public int maximumLengthSubstring(String s) {    
        int ans = 0;
        for(int i = 0;i < s.length() ;i++){
            int a = 0;
            int arr[] = new int[26];
            for(int j = i ;j < s.length() ;j++){
            if(arr[s.charAt(j) - 'a'] < 2){
                arr[s.charAt(j) - 'a']++;
                a++;
            }else{
                break;
            }
        }
        ans = Math.max(ans,a);

        }
        
        return ans;
    }
}