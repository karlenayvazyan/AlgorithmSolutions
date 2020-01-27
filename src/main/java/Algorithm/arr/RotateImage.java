package Algorithm.arr;

public class RotateImage {

    public void rotate(int[][] matrix) {
        moveSide(matrix);
        second(matrix);
        System.out.println();
    }

    private void second(int[][] matrix) {
        int temp = matrix[0][1];
        matrix[0][1] = matrix[1][0];
        matrix[1][0] = matrix[2][1];
        matrix[2][1] = matrix[1][2];
        matrix[1][2] = temp;
    }

    private void moveSide(int[][] matrix) {
        int temp = matrix[0][0];
        matrix[0][0] = matrix[matrix.length - 1][0];
        matrix[matrix.length - 1][0] = matrix[matrix.length - 1][matrix.length - 1];
        matrix[matrix.length - 1][matrix.length - 1] = matrix[0][matrix.length - 1];
        matrix[0][matrix.length - 1] = temp;
    }
}
