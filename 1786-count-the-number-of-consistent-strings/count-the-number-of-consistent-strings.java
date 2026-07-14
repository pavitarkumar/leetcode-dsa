class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        for(char ch : allowed.toCharArray()){
            mask |= (1 << (ch-'a'));
        }
        int count = 0;
        for(String word : words){
            boolean ok = true;
            for(char ch : word.toCharArray()){
                if((mask & (1 << (ch - 'a'))) == 0){
                    ok = false;
                    break;
                }
            }
            if(ok) count++;
        }
        return count;
    }
}