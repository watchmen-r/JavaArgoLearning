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

class ConvertSortedArray {
    public static void main(String[] args) {

    }

    static TreeNode helper(int[] num, int left, int right) {
        if(left > right) return null;

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, left, mid - 1);
        node.right = helper(num, mid + 1, right);
        return node;
    }

    // 解きなおし
    static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return helper(nums, 0, nums.length-1);
    }

}