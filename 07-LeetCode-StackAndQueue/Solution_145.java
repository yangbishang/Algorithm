import java.util.ArrayList;
import java.util.List;

/**
 给定一个二叉树，返回它的 后序 遍历。

 示例:

 输入: [1,null,2,3]
 1
 \
 2
 /
 3

 输出: [3,2,1]
 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class Solution_145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List list = new ArrayList();
        if(root == null)
            throw new IllegalArgumentException("root is empty");
        postorderTraversal(root , list);
        return list;
    }

    private void postorderTraversal(TreeNode node , List list){
        if(node != null){
            postorderTraversal(node.left , list);
            postorderTraversal(node.right, list);
            list.add(node.val);
        }


    }
}
