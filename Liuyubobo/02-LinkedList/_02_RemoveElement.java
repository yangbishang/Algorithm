/**
     删除链表中等于给定值 val 的所有节点。

     示例:
     输入: 1->2->6->3->4->5->6, val = 6
     输出: 1->2->3->4->5
 */
// 使用虚拟头结点
// 时间复杂度: O(n)
// 空间复杂度: O(1)
public class _02_RemoveElement {

    public ListNode removeElements(ListNode head, int val) {

        // 创建虚拟头结点
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                ListNode delNode = cur.next;
                cur.next = delNode.next;
            } else
                cur = cur.next;
        }

        return dummyHead.next;
    }
}
