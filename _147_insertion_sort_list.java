class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x; 
        next = null;
    }
}

public class _147_insertion_sort_list{
    public ListNode insertionSortList(ListNode head) {
        ListNode left = head, right = head, cur = head;
        while(cur!=null){
            if(cur.val >= right.val){
                right = cur;
                cur = cur.next;
            }else if(cur.val <= left.val){
                right.next = cur.next;
                cur.next = left;
                left = cur;
                cur = right.next;
            }else{
                for(ListNode cmp = left; cmp != right; cmp = cmp.next){
                    if(cmp.val <= cur.val && cur.val < cmp.next.val){
                        right.next = cur.next;
                        cur.next = cmp.next;
                        cmp.next = cur;
                        cur = right.next;
                        break;
                    }
                }
            }
        }
        return left;
    }
    
    private void display(ListNode head){
        ListNode cur = head;
        while(cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static void main(String[] args){
        _147_insertion_sort_list a = new _147_insertion_sort_list();
        ListNode head = new ListNode(2);
        ListNode cur = head;
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(4);
        ListNode last = new ListNode(3);
        cur.next = second;
        second.next = third;
        third.next = last;
        System.out.println("before sort");
        a.display(head);
        ListNode res = a.insertionSortList(head);
        System.out.println("after sort");
        a.display(res);
    }
}
