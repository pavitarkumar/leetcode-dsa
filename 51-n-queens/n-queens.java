class Solution {
    public static boolean ifSafe(char ans[][],int row ,int col){
        int n = ans.length;
        //Column check
        for(int i = row -1;i >= 0;i--){
            if(ans[i][col] == 'Q') return false;
        }
        //left dignal
        for(int r = row-1, c = col-1;r >= 0 && c >= 0;r--,c--){
            if(ans[r][c] == 'Q') return false;
        }
        //right dignal
        for(int r = row-1, c = col +1;r >= 0 && c < n;r--,c++){
            if(ans[r][c] == 'Q') return false;
        }
        return true;
    }
    public static void nqueen(char ans[][],List<List<String>> fans,int row){
        int len = ans.length;
        if(row == len){
            List<String> str = new ArrayList<>();
            for(int i =0 ;i < len;i++){
                StringBuilder s = new StringBuilder();
                for(int j = 0;j < len;j++){
                    s.append(ans[i][j]);
                }
                str.add(s.toString());
            }
            fans.add(str);
            return;
        }
        for(int j = 0;j < len;j++){
            if(ifSafe(ans,row,j)){
                ans[row][j] ='Q';
                nqueen(ans,fans,row+1);
                ans[row][j] = '.';
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> fans = new ArrayList<>();
        char ans[][] = new char[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                ans[i][j] = '.';
            }
        }
        nqueen(ans,fans,0);
        return fans;
    }
}