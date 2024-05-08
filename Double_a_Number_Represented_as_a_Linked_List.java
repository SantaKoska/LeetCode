import java.util.LinkedList;
public class Double_a_Number_Represented_as_a_Linked_List {
    
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode ls = head;

        int result=0;

        while(ls != null){

            result += ls.val;
            result *= 10;
            ls = ls.next; 
        }
        result = result/10;

        int dub = result * 2;
        String str = Integer.toString(dub);
        int n = 0;
        ListNode du = new ListNode(0);
        ls=du;
        while(n < str.length()){
            if(str.charAt(n) == '0'){
                ls.next = new ListNode(0);
                n++;
                ls = ls.next;
            }
            else {
            ls.next = new ListNode(str.charAt(n) - '0');
            n++;
            ls = ls.next;
            }
        }
        return du.next;
    }
}