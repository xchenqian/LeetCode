class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x) { val = x; }
}

public class _160_intersection_of_two_linked_lists {

    public int getLength(ListNode head){
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public ListNode moveSteps(ListNode head, int steps){        
        while(steps>0){
            head = head.next;
            steps--;
        }
        return head;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null) {
            return null;
        }
        int lenA = getLength(headA), lenB=getLength(headB);
        ListNode curA = headA, curB = headB;
        if (lenA>lenB) {                        
            curA = moveSteps(headA,lenA-lenB);
        }
        if (lenA<lenB) {            
            curB = moveSteps(headB,lenB-lenA);
        }
        while(curA!=null){
            if (curA==curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
      
        return null;
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
    	_160_intersection_of_two_linked_lists a = new _160_intersection_of_two_linked_lists();

    	ListNode headA = new ListNode(1);
    	ListNode cur = headA;
        ListNode tmp = new ListNode(2);
        cur.next = tmp;
        cur = tmp;
        ListNode inter = new ListNode(3);
        cur.next = inter;
        cur = inter;
        tmp = new ListNode(4);
        cur.next = tmp;
        cur = tmp;
        tmp = new ListNode(5);
        cur.next = tmp;
        cur = tmp;

        ListNode headB = new ListNode(7);
        ListNode cur2 = headB;
        tmp = new ListNode(8);
        cur2.next = tmp;
        cur2 = tmp;
        tmp = new ListNode(9);
        cur2.next = tmp;
        cur2 = tmp;

        cur2.next = inter;
        
        System.out.println("re:"+a.getIntersectionNode(headA,headB).val);    

    }
    
}