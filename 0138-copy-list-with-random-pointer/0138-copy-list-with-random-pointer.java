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

    int findNewLength(Node node){

        int len = 0;

        while(node != null){
            len++;
            node = node.next;
        }

        return len;
    }

    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }

        Node current = head;
        Node newHead = new Node(current.val);
        current = current.next;
        Node prev = newHead;
        int length = 1;

        while(current != null){
            Node newNode = new Node(current.val);
            prev.next = newNode;
            current = current.next;
            prev = newNode;
            length++;
        }

        current = head;
        Node newCurrent = newHead;

        while(current != null){
            Node randomNode = current.random;

            if(randomNode != null){
                int newLength = findNewLength(randomNode);
                int cnt = 0;
                Node traverse = newHead;

                while(cnt < (length - newLength)){
                    cnt++;
                    traverse = traverse.next;
                }

                newCurrent.random = traverse;
            }

            current = current.next;
            newCurrent = newCurrent.next;
        }

        return newHead;

        
    }
}