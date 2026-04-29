/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      
        List<Integer> list = new ArrayList<>();
        while(l1!=null){
            list.add(l1.val);
            l1=l1.next;
        }
        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }

         Collections.sort(list);

         ListNode dummy = new ListNode(-1);
         ListNode temp= dummy ;
         for(int val : list){
            temp.next= new ListNode(val);
            temp = temp.next;
         }
         return dummy.next ; 
        
    }
}