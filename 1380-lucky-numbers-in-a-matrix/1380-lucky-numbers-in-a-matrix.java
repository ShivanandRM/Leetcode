class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Store minimum element of every row
        int[] rowMin = new int[rows];

        for (int i = 0; i < rows; i++) {
            rowMin[i] = matrix[i][0];

            for (int j = 1; j < cols; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        // Store maximum element of every column
        int[] colMax = new int[cols];

        for (int j = 0; j < cols; j++) {
            colMax[j] = matrix[0][j];

            for (int i = 1; i < rows; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Find elements that are both row minimum and column maximum
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == rowMin[i] &&
                    matrix[i][j] == colMax[j]) {

                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}