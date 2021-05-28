package com.san;




/**
 * @Auther: Gxyx
 * @Date: 2021/04/19/17:18
 */
public class 有环链表 {

    public static ListNode detectCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while(l1 != null && l2 != null &&l2.next!=null ){
            l1= l1.next;
            l2 = l2.next.next;
            if(l1==l2){
                l2=head;
                while(l2!=l1){
                    //两相遇指针，一个从头结点开始，
                    //一个从相遇点开始每次走一步，直到
                    //再次相遇为止
                    l1=l1.next;
                    l2=l2.next;
                }
                return l1;
            }
        }
        return null;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}