/**
 删除链表中等于给定值 val 的所有节点。

 示例:

 输入: 1->2->6->3->4->5->6, val = 6
 输出: 1->2->3->4->5
 */
public class Solution_203 {
    public ListNode removeElements(ListNode head, int val) {
/*
        // 常规做法
        // 需要对头结点进行特殊处理
        while(head != null && head.val == val){
            head = head.next;
        }

        if(head == null)
            return head;

        ListNode cur = head;
        while(cur.next != null){
            if(cur.next.val == val){

                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }

        return head;
*/

    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode cur = dummyHead;
    while(cur.next != null){
        if(cur.next.val == val){
            cur.next = cur.next.next;

        }else{
            cur = cur.next;
        }
    }
    return dummyHead.next;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;

        ListNode head = new ListNode(arr);
        System.out.println(head);

        (new Solution_203()).removeElements(head, val);
        System.out.println(head);
    }
}
