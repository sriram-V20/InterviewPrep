/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> oldToNewNodeMap = new HashMap<>();

        Node temp = head;
        Node res = new Node(-1);
        Node dummy = res;
        while(temp != null){
            Node newNode = new Node(temp.val);
            oldToNewNodeMap.put(temp,newNode);
            oldToNewNodeMap.put(newNode,temp);
            dummy.next = newNode;
            dummy = dummy.next;
            temp = temp.next;
        }

        dummy = res.next;
        temp = head;
        while(temp != null){
            Node oldNodeRandomPointer = temp.random;
            Node newNodeRandomPointer = oldToNewNodeMap.get(oldNodeRandomPointer);
            dummy.random = newNodeRandomPointer;
            temp = temp.next;
            dummy = dummy.next;
        }

        return res.next;
    }
}
