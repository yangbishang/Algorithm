/**
 *
 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

 示例：

 给定一个链表: 1->2->3->4->5, 和 n = 2.

 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 说明：

 给定的 n 保证是有效的。

 进阶：

 你能尝试使用一趟扫描实现吗？
 */
public class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
/*
        // 先记录链表总长度
        // 需要对链表进行两次遍历
        // 时间复杂度: O(n)
        // 空间复杂度: O(1)
        int size = 0;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while(cur.next!=null){
            size++;
            cur = cur.next;
        }
        System.out.println(size);

        cur = dummyNode;
        for(int i=1; i<= (size-n); i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummyNode.next;

*/

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode l = dummyNode;
        ListNode r = dummyNode;

        for(int i=0; i<n+1; i++){
            assert r != null;
            r = r.next;
        }

        while(r!=null){
            l = l.next;
            r = r.next;
        }

        l.next = l.next.next;

        return  dummyNode.next;




    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr);
        System.out.println(head);

        head = (new Solution_19()).removeNthFromEnd(head, 2);
        System.out.println(head);
    }
}
