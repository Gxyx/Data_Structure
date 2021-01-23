package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/23/22:47
 */
public class 分割链表_725 {

    public ListNode[] splitListToParts(ListNode root, int k) {
        int n = 0;
        ListNode cur = root;
        while (cur!=null){
            n++;
            cur = cur.next;
        }
    /**
     * 分割之后链表的节点个数，前mod个链表的节点个数为size+1，之后的为size
     * 若N<k,则前面每个链表为一个元素，后面的为空
     *
     */
        int mod = n%k;
        int size = n/k;
        ListNode[] result = new ListNode[k];
        //cur重新：指向root的首地址
        cur = root;
        for (int i = 0; cur != null && i < k; i++) {
            result[i] = cur;
            int curSize = size;
            if (mod>0){
                curSize = size+1;
            }else {
                curSize = size;
            }
            for (int j = 0; j < curSize - 1; j++) {
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return result;
    }
}
