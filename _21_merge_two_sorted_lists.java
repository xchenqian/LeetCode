class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x) { val = x; }
}

public class _21_merge_two_sorted_lists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null) {
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode p = l1, q = l2;
        ListNode head;
        if (l1.val<=l2.val) {
            head = l1;
            p = l1.next;
        }else{
            head = l2;
            q = l2.next;
        }
        ListNode cur = head;
        while(p!=null && q!=null){
            if(p.val <= q.val){
                cur.next = p;
                cur = cur.next;
                p = p.next;
            }else{
                cur.next = q;
                cur = cur.next;
                q = q.next;
            }
        }
        if(p!=null){
            cur.next = p;           
        }
        if(q!=null){
            cur.next = q;            
        }
        return head;
    }

	public void display(ListNode head){
		if (head==null) {
			System.out.println("empty");
		}
		ListNode tmp = head;
		while (tmp!=null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}


    public static void main(String[] args) {
    	_21_merge_two_sorted_lists a = new _21_merge_two_sorted_lists();

    	ListNode head = new ListNode(1);
    	ListNode cur = head;
        ListNode tmp = new ListNode(3);
        cur.next = tmp;
        cur = tmp;
        tmp = new ListNode(4);
        cur.next = tmp;
        cur = tmp;
  

        ListNode head2 = new ListNode(0);

        System.out.println("l1 list:-----");
    	a.display(head);

        System.out.println("l2 list:-----");
        a.display(head2);
    	
        ListNode re = a.mergeTwoLists(head,head2);
        System.out.println("re list:-----");
        a.display(re);

    }
    
}