class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows > s.length()) return s;
        int jump = (numRows - 1)*2;
        StringBuilder ans = new StringBuilder();

        for(int row = 0;row < numRows ;row++){

            for(int i = row;i < s.length();i+=jump){
                
                ans.append(s.charAt(i));

                int d = i + jump - row*2;

                if(row != 0 && row != numRows - 1 && d < s.length()){
                    ans.append(s.charAt(d));
                }
            }
        }
        return ans.toString();
    }
}