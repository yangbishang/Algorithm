import java.util.HashSet;

/**
 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

 示例 1:

 输入: 1->1->2
 输出: 1->2
 示例 2:

 输入: 1->1->2->3->3
 输出: 1->2->3
 */
public class Solution_83 {



    public ListNode deleteDuplicates(ListNode head) {
        ListNode curNode = head;
        while(curNode!=null && curNode.next!=null){
            if(curNode.val == curNode.next.val){
                curNode.next = curNode.next.next;

            }else{
                curNode = curNode.next;
            }
        }
        return head;
    }



    public static void main(String[] args) {

        int[] nums = {1, 1,2,3,3};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode head2 = (new Solution_83()).deleteDuplicates(head);
        System.out.println(head2);
    }
}
