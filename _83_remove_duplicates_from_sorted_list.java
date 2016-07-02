class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x) { val = x; }
}

public class _83_remove_duplicates_from_sorted_list {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null){
            if(pre.val==cur.val){                
                cur = cur.next;
                pre.next = cur;
            }else{
                pre = cur;
                cur = cur.next;
            }
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
    	_83_remove_duplicates_from_sorted_list a = new _83_remove_duplicates_from_sorted_list();

    	ListNode head = new ListNode(1);
    	ListNode cur = head;
        ListNode tmp = new ListNode(1);
        cur.next = tmp;
        cur = tmp;
        tmp = new ListNode(2);
        cur.next = tmp;
        cur = tmp;
        tmp = new ListNode(3);
        cur.next = tmp;
        cur = tmp;
        tmp = new ListNode(3);
        cur.next = tmp;
        cur = tmp;
        tmp = new ListNode(4);
        cur.next = tmp;
        cur = tmp;


    	a.display(head);
    	
        a.deleteDuplicates(head);

        System.out.println("----");
    	a.display(head);

    }
    
}