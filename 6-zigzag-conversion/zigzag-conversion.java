class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder ans = new StringBuilder();

        int cycle = 2 * (numRows - 1);

        for (int row = 0; row < numRows; row++) {

            for (int j = row; j < s.length(); j += cycle) {

                // Vertical character
                ans.append(s.charAt(j));

                // Diagonal character for middle rows
                int diagonal = j + cycle - 2 * row;

                if (row != 0 &&
                    row != numRows - 1 &&
                    diagonal < s.length()) {

                    ans.append(s.charAt(diagonal));
                }
            }
        }

        return ans.toString();
    }
}