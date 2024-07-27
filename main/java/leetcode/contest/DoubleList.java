package leetcode.contest;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class DoubleList {
    static ListNode rev(ListNode node){

        ListNode prev = null, next = null;
        ListNode curr = node;

        while(curr != null){
            next = curr.next;
            prev = curr.next;
            prev = curr;
            curr = next;
        }

        return prev;
    }
   static public ListNode doubleIt(ListNode head) {
        //it is just multiplication of number * 2 and add the carry forward

        int cf = 0;
        head = rev(head);;
        ListNode temp = head;
        while(temp != null){
            int tempval = temp.val;
            tempval = tempval *  2 + (cf);
            temp.val = tempval%10;
            cf = tempval / 10;
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }

        if(cf != 0){
            temp.next = new ListNode(cf);
        }
        head = rev(head);
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(8);
        node.next.next = new ListNode(9);
        doubleIt(node);
        System.out.println("debug");
    }
}
