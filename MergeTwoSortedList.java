class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
        next = null;
    }
}
public class MergeTwoSortedList{
    private void display(ListNode head){
       ListNode cur = head;
       while(cur!=null){ 
          System.out.println(cur.val);
          cur = cur.next;
       }
    }
                                         
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(head1 != null && head2 !=null){
            if(head1.val <= head2.val){
                cur.next = head1;
                head1 = head1.next;
            }else{
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        if(head1 != null){
            cur.next = head1;
        }
        if(head2 != null){
            cur.next = head2;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        MergeTwoSortedList a = new MergeTwoSortedList();
        ListNode head1 = new ListNode(1);
        ListNode cur1 = head1;
        ListNode second1 = new ListNode(3);
        ListNode third1 = new ListNode(4);
        ListNode last1 = new ListNode(10);
        cur1.next = second1;
        second1.next = third1;
        third1.next = last1;

        ListNode head2 = new ListNode(1);
        ListNode cur2 = head2;
        ListNode second2 = new ListNode(2);
        ListNode third2 = new ListNode(3);
        ListNode last2 = new ListNode(12);
        cur2.next = second2;
        second2.next = third2;
        third2.next = last2;

        ListNode res = a.merge(head1, head2);
        a.display(res);
    }
}
