class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(char ch : ransomNote.toCharArray()){
            arr1[ch - 'a']++;
        }
        for(char ch : magazine.toCharArray()){
            arr2[ch - 'a']++;
        }
        for(int i = 0;i < 26 ;i++){
            if(arr1[i] > arr2[i]) return false;
        }
        return true;

    }
}