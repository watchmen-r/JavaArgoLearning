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

    static boolean validate (TreeNode root, Integer low, Integer high) {
        if(root == null) return true;

        if((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }

    static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}