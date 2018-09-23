
/**
     反转一个单链表。

     示例:
     输入: 1->2->3->4->5->NULL
     输出: 5->4->3->2->1->NULL

     进阶:
     你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
// 时间复杂度: O(n)
// 空间复杂度: O(1)
public class _01_ReverseLinkedList {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;
        }

        return pre;
    }
}
