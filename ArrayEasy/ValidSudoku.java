package ArrayEasy;

class ValidSudoku {
    public static void main(String[] args) {
        // 入力が多いのでスキップ
    }

    static boolean isValidSudoku(char[][] board) {
        int n = 9;

        int[][] rows = new int[n][n];
        int[][] cols = new int[n][n];
        int[][] boxes = new int[n][n];

        // rは行
        for (int r = 0; r < n; r++) {
            // cは列
            for (int c = 0; c < n; c++) {
                // .だったら次
                if (board[r][c] == '.') {
                    continue;
                }

                // 数を配列の索引にする
                // charの１を引くことでintで1を引いた数になる
                int pos = board[r][c] - '1';

                // 行に値がすでにあった場合
                if (rows[r][pos] == 1) {
                    return false;
                }
                rows[r][pos] = 1;

                // 列に値がすでにあった場合
                if (cols[c][pos] == 1) {
                    return false;
                }
                cols[c][pos] = 1;

                // 3×3に値がすでにあった場合
                int boxIndex = (r / 3) * 3 + c / 3;
                if (boxes[boxIndex][pos] == 1) {
                    return false;
                }
                boxes[boxIndex][pos] = 1;
            }
        }
        return true;
    }
}