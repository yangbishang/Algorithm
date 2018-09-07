
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 给定一个二叉树，返回它的 前序 遍历。

 示例:

 输入: [1,null,2,3]
 1
 \
 2
 /
 3

 输出: [1,2,3]
 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */

public class Solution_144 {

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
   }

/*

    //递归法
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root , list);
        return list;

    }

    private void preorderTraversal(TreeNode node,List list){

        if(node == null)
            return ;

        list.add(node.val);
        preorderTraversal(node.left , list);
        preorderTraversal(node.right, list);

        return;
    }

*/


    //模拟计算指令
    private class Command{
        String s;   // 描述命令是什么——go（访问某个节点）, print（输出某个节点）
        TreeNode node;  //指令作用的节点
        Command(String s, TreeNode node){
            this.s = s;
            this.node = node;
        }
    };

    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;

        Stack<Command> stack = new Stack<Command>();
        stack.push(new Command("go", root));
        while(!stack.empty()){
            Command command = stack.pop();

            if(command.s.equals("print"))
                res.add(command.node.val);
            else{
/*                assert command.s.equals("go");*/
                if(command.node.right != null)
                    stack.push(new Command("go",command.node.right));
                if(command.node.left != null)
                    stack.push(new Command("go",command.node.left));
                stack.push(new Command("print", command.node));
            }
        }
        return res;
    }

}
