package OthersEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            List<Integer> beforeList = answer.get(i - 1);

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    tmp.add(1);
                    continue;
                }
                tmp.add(beforeList.get(j-1) + beforeList.get(j));
            }
            answer.add(tmp);
        }
        return answer;
    }

}