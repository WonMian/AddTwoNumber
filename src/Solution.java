


public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode ret = new ListNode(0);
        ListNode cur = ret;
        int sum = 0;

        while(true)
        {
            if(p1 != null)
            {
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null)
            {
                sum += p2.val;
                p2 = p2.next;
            }
            cur.val = sum % 10;
            sum /= 10;
            if (p1 != null || p2 != null || sum != 0)
            {
                cur = (cur.next =new ListNode(0));
            }
            else
            {
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) throws Exception{
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode ret = addTwoNumbers(l1,l2);
        while(ret != null)
        {
            System.out.println(ret.val);
            ret = ret.next;
        }

    }
}