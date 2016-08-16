class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
        next = null;
    }
}

public class _142_linked_list_cycle_II {

    public ListNode detectCycle(ListNode head) {
        if (head==null) {
            return null;
        }
        if (head.next==null) {
            return null;
        }
        if (head.next.next==null) {
            return null;
        }
        ListNode slow = head;
        ListNode quick = head;

        while(quick!=null&&quick.next!=null){
            slow = slow.next;
            quick = quick.next.next;
            if (slow==quick) {
                break;
            }
        }

        if (quick==null || quick.next==null) {
            return null;
        }
        
        slow = head;
        while(slow!=quick){
            slow = slow.next;
            quick = quick.next;
        }
        return slow;

    }


    public static void main(String[] args) {
    	_142_linked_list_cycle_II a = new _142_linked_list_cycle_II();

    	ListNode head = new ListNode(1);
    	ListNode cur = head;
        ListNode tmp = new ListNode(2);
        cur.next = tmp;
        cur = tmp;
        ListNode tmp2 = new ListNode(3);
        cur.next = tmp2;
        cur = tmp2;
        ListNode last = new ListNode(4);
        cur.next = last;
        cur = last;

        cur.next = tmp;
     	

        
        System.out.println("re:"+a.detectCycle(head).val);

    }
    
}