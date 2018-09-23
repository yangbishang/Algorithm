/**
     翻转一棵二叉树。

     示例：
     输入：
          4
        /   \
       2     7
      / \   / \
     1   3 6   9

     输出：
           4
         /   \
        7     2
      / \   / \
     9   6 3   1
 */
// 时间复杂度: O(n), n为树中节点个数
// 空间复杂度: O(h), h为树的高度
public class _02_InvertBinaryTree {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {

        if(root == null)
            return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
