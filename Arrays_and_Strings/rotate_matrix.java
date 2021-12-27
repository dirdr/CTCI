/**
 * rotate a matrix in place by 90° clockwise
 *            [1, 2, 3]    [7, 4, 1]
 *  example:  [4, 5, 6] -> [8, 5, 2]
 *            [7, 8, 9]    [9, 6, 3]
 */
public static void rotate_matrix(int[][] matrix) {
    /*
        transpose the matrix
     */
    int[][] temp_matrix = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            temp_matrix[i][j] = matrix[j][i];
        }
    }
    for (int i = 0; i < temp_matrix.length; i++) {
        for (int j = 0; j < temp_matrix[i].length; j++) {
            matrix[i][j] = temp_matrix[i][j];
        }
    }
    /*
        reverse the rows
     */
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length/2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][matrix[i].length-1-j];
            matrix[i][matrix[0].length-1-j] = temp;
        }
    }
}
