/**
 * 给定一个二叉树，返回它的中序 遍历。

 示例:

 输入: [1,null,2,3]
 1
 \
 2
 /
 3

 输出: [1,3,2]
 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */


import java.util.ArrayList;
import java.util.List;
public class Solution_94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root , list);
        return list;
    }
    private void inorderTraversal(TreeNode node,List list){

        if(node != null){
            inorderTraversal(node.left , list);
            list.add(node.val);
            inorderTraversal(node.right, list);
        }

    }
}
