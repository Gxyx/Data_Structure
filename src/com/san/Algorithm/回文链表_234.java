package com.san.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/23/22:14
 */
public class 回文链表_234 {

    public boolean isPalindrome(ListNode head) {

        List<Integer> vals = new ArrayList<>();
        while (head != null) {
            vals.add(head.val);
            head = head.next;
        }
        int pre1 = 0;
        int pre2 = vals.size()-1;
        while (pre1<pre2){
            if (!vals.get(pre1).equals(vals.get(pre2))) {
                return false;
            }
            pre1++;
            pre2--;
        }
        return true;
    }
}
