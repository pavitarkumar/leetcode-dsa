class Solution {
    public boolean sumGame(String num) {
        int st = 0;
        int end = num.length() - 1;
        int Sum = 0;
        int Q = 0;
        while(st < end){
            if(num.charAt(st) != '?'){
                Sum += num.charAt(st) - '0';
            }else{
                Q--;
            }
            if(num.charAt(end) != '?'){
                Sum -= num.charAt(end) - '0';
            }else{
                Q++;
            }
            st++;
            end--;
        }
        return (Sum) * 2 != (Q) * 9;
    }
}