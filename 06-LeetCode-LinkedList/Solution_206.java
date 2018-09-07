import java.util.LinkedList;

/**
 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */

public class Solution_206 {
/*
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
*/

    public ListNode reverseList(ListNode head) {

        if(head == null)
            throw  new IllegalArgumentException("list is empty");

        ListNode cur =  head;
        ListNode pre = null;

        while(cur != null){
            ListNode next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;

        }

        return pre;


    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode head2 = (new Solution_206()).reverseList(head);
        System.out.println(head2);
    }



}
