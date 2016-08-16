class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x) { val = x; }
}

public class _24_swap_nodes_in_pairs {

    public ListNode swapPairs(ListNode head) {
        if (head==null) {
            return null;        
        }
        if (head.next==null) {
            return head;
        }
        ListNode cur = head;
        int tmp;
        while(cur!=null){
            if (cur.next!=null) {
                tmp = cur.next.val;
                cur.next.val = cur.val;
                cur.val = tmp;                            
                cur = cur.next.next;    
            }else{
                break;
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
            //System.out.print(tmp.val+"->");
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
    	_24_swap_nodes_in_pairs a = new _24_swap_nodes_in_pairs();

    	ListNode head = new ListNode(1);
    	ListNode cur = head;
    	for (int i=0; i<4; i++) {
    		ListNode tmp = new ListNode(i+2);
    		cur.next = tmp;
    		cur = tmp;
    	}

    	a.display(head);
    	System.out.println("----");

    	a.swapPairs(head);
    	a.display(head);

    }
    
}