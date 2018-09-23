/**
     给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

     示例:
     给定 1->2->3->4, 你应该返回 2->1->4->3.

     说明:
     你的算法只能使用常数的额外空间。
     你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
// 时间复杂度: O(n)
// 空间复杂度: O(1)
public class _03_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        while (p.next != null && p.next.next != null) {
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;
            node2.next = node1;
            node1.next = next;
            p.next = node2;

            p = node1;
        }

        return dummyHead.next;
    }
}
