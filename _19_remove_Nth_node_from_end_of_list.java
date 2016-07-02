class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x) { val = x; }
}

public class _19_remove_Nth_node_from_end_of_list {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode pre = head;
        ListNode cur = head;
        while(n>0){
            cur = cur.next;
            n--;
        }
        if(cur==null){
            head = head.next;
            return head;
        }
        while(cur.next!=null){
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
        
    }

	public void display(ListNode head){
		if (head==null) {
			System.out.println("empty");
		}
		ListNode tmp = head;
		while (tmp!=null) {
			//System.out.print(tmp.val+"->");
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}


    public static void main(String[] args) {
    	_19_remove_Nth_node_from_end_of_list a = new _19_remove_Nth_node_from_end_of_list();

    	ListNode head = new ListNode(1);
    	ListNode cur = head;
    	for (int i=0; i<4; i++) {
    		ListNode tmp = new ListNode(i+2);
    		cur.next = tmp;
    		cur = tmp;
    	}

    	a.display(head);
    	System.out.println("----");

    	a.removeNthFromEnd(head,2);
    	a.display(head);

    }
    
}