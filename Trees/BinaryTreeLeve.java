package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 下記が入ってくる
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

class BinaryTree {
    public static void main(String[] args) {

    }

    static void search(TreeNode node, List<List<Integer>> answer, int level) {
        if(node == null) return;
        List<Integer> list = new ArrayList<>();
        if(answer.size() > level) {
            list = answer.get(level);
        } else {
            answer.add(list);
        }
        list.add(node.val);
        search(node.left, answer, level+1);
        search(node.right, answer, level+1);
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        search(root, answer, 0);
        return answer;
    }
}