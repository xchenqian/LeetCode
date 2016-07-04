class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
        next = null;
    }
}

public class _141_linked_list_cycle {

    public boolean hasCycle(ListNode head) {
        if (head==null) {
            return false;
        }
        if (head.next==null) {
            return false;
        }
        if (head.next.next==null) {
            return false;
        }
        ListNode slow = head;
        ListNode quick = head;

        while(quick!=null&&quick.next!=null){
            slow = slow.next;
            quick = quick.next.next;
            if (slow==quick) {
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) {
    	_141_linked_list_cycle a = new _141_linked_list_cycle();

    	ListNode head = new ListNode(1);
    	ListNode cur = head;
        ListNode tmp = new ListNode(3);
        cur.next = tmp;
        cur = tmp;
        ListNode last = new ListNode(4);
        cur.next = last;
        cur = last;

        cur.next = tmp;

        /**
        1 -> 3 -> 4
              /\  |
              |   |
              < - \/

        */
     	
        
        System.out.println("re:"+a.hasCycle(head));

    }
    
}