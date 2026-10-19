class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char cell = board[row][col];

                if (cell == '.') {
                    continue;
                }

                int digit = cell - '1';
                int box = (row / 3) * 3 + (col / 3);

                if (rows[row][digit]
                        || columns[col][digit]
                        || boxes[box][digit]) {
                    return false;
                }

                rows[row][digit] = true;
                columns[col][digit] = true;
                boxes[box][digit] = true;
            }
        }

        return true;
    }
}