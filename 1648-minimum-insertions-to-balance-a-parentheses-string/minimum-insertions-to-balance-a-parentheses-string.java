class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int leftCount = 0;
        int l = s.length();
        int index = 0;
        while(index < l){
            if(s.charAt(index) == '('){
                leftCount+=1;
                index++;
            }else{
                if(leftCount > 0){
                    leftCount--;
                }else{
                    insertions++;
                }
                if(index < l-1 && s.charAt(index+1) == ')'){
                index+=2;
            }else{
                insertions++;
                index++;
            }
            }
        }
        insertions+=leftCount*2;
        return insertions;
    }
}