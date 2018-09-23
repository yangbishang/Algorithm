/**
     给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

     示例：
     给定一个链表: 1->2->3->4->5, 和 n = 2.
     当删除了倒数第二个节点后，链表变为 1->2->3->5.

     说明：
     给定的 n 保证是有效的。

     进阶：
     你能尝试使用一趟扫描实现吗？
 */

// 先记录链表总长度
// 需要对链表进行两次遍历
// 时间复杂度: O(n)
// 空间复杂度: O(1)
public class _05_RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        int length = 0;
        for(ListNode cur = dummyHead.next ; cur != null ; cur = cur.next)
            length ++;

        int k = length - n;
        assert k >= 0;
        ListNode cur = dummyHead;
        for(int i = 0 ; i < k ; i ++)
            cur = cur.next;

        cur.next = cur.next.next;

        return dummyHead.next;
    }

}
