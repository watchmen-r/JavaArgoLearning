package ArrayEasy;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
  public static void main(String[] args) {
    // 入力が多いのでスキップ
  }
  
  // TODO ×解きなおし
  static boolean isValidSudoku(char[][] board) {
    Set<String> set = new HashSet<String>();
    for(int i = 0; i < 9; i++) {
      for(int j = 0; j < 9; j++) {
        char numChar = board[i][j];
        if(numChar != '.') {
          if(!set.add(numChar + " in row " + i) ||
             !set.add(numChar + " in column " + j) ||
             !set.add(numChar + " in block " + i/3 + "-" + j/3)){
              return false;
             }
        }
      }
    }
    return true;
  }
}