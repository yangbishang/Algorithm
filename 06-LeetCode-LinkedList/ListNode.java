public class ListNode {


    int val;
    ListNode next;

    public ListNode(int x){
         val = x;
    }

    public ListNode(int[] arr){
        this.val = arr[0];
        ListNode curNode = this;
         for (int i = 1; i < arr.length; i++) {
             curNode.next = new ListNode(arr[i]);
             curNode = curNode.next;
         }
     }

     @Override
     public String toString(){
        StringBuffer s = new StringBuffer("");
        ListNode curNode = this;
        while(curNode !=null){
            s.append(Integer.toString(curNode.val));
            s.append("->");
            curNode = curNode.next;
        }
        s.append("null");
        return s.toString();
     }

}
