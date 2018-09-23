/**
     给定一个二叉树，它的每个结点都存放着一个整数值。

     找出路径和等于给定数值的路径总数。
     路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
     二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。

     示例：
     root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

             10
            /  \
           5   -3
          / \    \
        3   2   11
       / \   \
     3  -2   1

     返回 3。和等于 8 的路径有:

     1.  5 -> 3
     2.  5 -> 2 -> 1
     3.  -3 -> 11
 */


// 时间复杂度: O(n), n为树的节点个数
// 空间复杂度: O(h), h为树的高度
public class _04_PathSumⅢ {

    /// Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // 在以root为根节点的二叉树中,寻找和为sum的路径,返回这样的路径个数
    public int pathSum(TreeNode root, int sum) {

        if(root == null)
            return 0;

        return findPath(root, sum)
                + pathSum(root.left , sum)
                + pathSum(root.right , sum);
    }

    // 在以node为根节点的二叉树中,寻找包含node的路径,和为sum
    // 返回这样的路径个数
    private int findPath(TreeNode node, int num){

        if(node == null)
            return 0;

        int res = 0;
        if(node.val == num)
            res += 1;

        res += findPath(node.left , num - node.val);
        res += findPath(node.right , num - node.val);

        return res;
    }


}
