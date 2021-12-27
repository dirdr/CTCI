/**
 * Write an algorithm such that
 * if an element in a MxN matrix is 0,
 * the entire rows and columns are set to 0
 */
public static void zero_matrix(int[][] matrix) {
    boolean[] helper = new boolean[matrix.length+matrix[0].length];
    Arrays.fill(helper, false);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                helper[i] = true;
                helper[matrix.length + j] = true;
            }
        }
    }
    /*
    Helper store the index of rows that need to be zeroed in the part < helper.length/2,
    in the other part ( > helper.length/2 ) helper store the index of columns that need to be zeroed
     */
    System.out.println(Arrays.toString(helper));
    for (int k = 0; k < helper.length; k++) {
        if (helper[k]) {
            if (k < matrix.length) {
                // zeroed row
                for (int i = 0; i < matrix.length; i++) {
                    matrix[k][i] = 0;
                }
            } else {
                // zeroed column
                for (int i = 0; i < matrix[0].length; i++) {
                    matrix[i][k-matrix.length] = 0;
                }
            }
        }
    }
}
