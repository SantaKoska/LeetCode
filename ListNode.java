import java.util.Stack;

public class Remove_Nodes_From_Linked_List {
    
}
public class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    
    public ListNode removeNodes(ListNode head) {
            ListNode curr = head;
            Stack<ListNode> stack = new Stack<>();
            while (curr != null) {
                while(!stack.empty() && stack.peek().val < curr.val){
                    stack.pop();
                }
                stack.push(curr);
                curr = curr.next;
            }

            ListNode nxt = null;
            while (!stack.empty()) {
                curr = stack.pop();
                curr.next=nxt;
                nxt = curr;
            }
            return curr;
        }
    };