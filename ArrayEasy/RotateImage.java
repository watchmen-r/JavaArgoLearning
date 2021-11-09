package ArrayEasy;

class RotateImage {
  public static void main(String[] args) {
    int nums[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
    rotate1(nums);
    rotate2(nums);
  }

  // TODO 解きなおし どちらの解放も難しい
  static void rotate1(int[][] matrix) {
    int n = matrix.length;
    for(int i = 0; i < (n + 1) / 2; i++) {
      for(int j = 0; j < n / 2; j++) {
        int tmp = matrix[n-1-i][i];
        matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
        matrix[n-1-i][n-j-1] = matrix[j][n-1-i];
        matrix[j][n-1-i] = matrix[i][j];
        matrix[i][j] = tmp;
      }
    }
  }

  // 一番いい解答。発想は知らないと難しいが理解は簡単
  static void rotate2(int[][] matrix) {
    transpose(matrix);
    reflect(matrix);
  }

  public static void transpose(int[][] matrix) {
    int n = matrix.length;
    for(int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) {
        int tmp = matrix[j][i];
        matrix[j][i] = matrix[i][j];
        matrix[i][j] = tmp;
      }
    }
  }

  public static void reflect(int[][] matrix) {
    int n = matrix.length;
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n/2; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][n-j-1];
        matrix[i][n-j-1] = tmp;
      }
    }
  }
}