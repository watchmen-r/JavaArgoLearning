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

    // 解きなおし
    static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();

        if(root == null) return answer;

        queue.add(root);

        while(!queue.isEmpty()) {
            // すでに入っているqueueサイズぶん、後でループする
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();

            for(int i = 0; i < levelNum; i++) {
                // 子のノードがあれば入れておく
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                subList.add(queue.poll().val);
            }
            answer.add(subList);
        }
        return answer;
    }
}