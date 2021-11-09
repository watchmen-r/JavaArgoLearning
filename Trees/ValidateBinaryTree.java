package Trees;


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

class ValidateBinaryTree {
    public static void main(String[] args) {

    }

    // 解きなおし、BinaryTreeについて理解不足
    static boolean validate (TreeNode root, Integer low, Integer high) {
        if(root == null) return true;

        if((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        // 左の第３引数には、これ以上大きくなってはいけないのでroot.valを
        // 右の第２引数には、これ以上小さくなってはいけないのでlowにroot.valを入れている
        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

    static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}