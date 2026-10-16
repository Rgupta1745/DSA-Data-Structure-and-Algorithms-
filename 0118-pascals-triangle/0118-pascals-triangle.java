class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] values = new int[numRows][numRows];

        for (int row = 0; row < numRows; row++) {
            values[row][0] = 1;
            values[row][row] = 1;

            for (int col = 1; col < row; col++) {
                values[row][col] =
                    values[row - 1][col - 1] + values[row - 1][col];
            }
        }

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> current = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                current.add(values[row][col]);
            }

            triangle.add(current);
        }

        return triangle;
    }
}