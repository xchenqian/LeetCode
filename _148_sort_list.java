class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class _148_sort_list{
    private ListNode findMid(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode merge(ListNode head1, ListNode head2){
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

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);
        return merge(left, right);
    }

    private void display(ListNode head){
         ListNode cur = head;
         while(cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
         }
    }
    public static void main(String[] args){
        _148_sort_list a = new _148_sort_list();
        ListNode head = new ListNode(2);
        ListNode cur = head;
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(4);
        ListNode last = new ListNode(3);
        cur.next = second;
        second.next = third;
        third.next = last;
        ListNode res = a.sortList(head);
        a.display(res);
    }
}
