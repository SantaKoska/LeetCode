class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null){
            return;
        }
        else{
            node.val = node.next.val;
            
            node.next = node.next.next;
        }
  }
}
