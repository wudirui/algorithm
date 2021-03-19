package test2;

class Node {
    int value;
    Node next;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }
}


public class TwoIntegerLinkListSum {
    public static void main(String[] args) {

    }

    /**
     * 迭代法
     *
     * @param node1
     * @param node2
     * @return
     */
    public static Node getSum(Node node1, Node node2) {
        Node head = new Node(0);
        Node curr = head;
        while (node1 != null && node2 != null) {
            curr.value = (node1.value + node2.value + curr.value) % 10;
            curr.next = new Node((node1.value + node2.value + curr.value) / 10);
            curr = curr.next;
            node1 = node1.next;
            node2 = node2.next;
        }
        while (node1 != null) {
            curr.value = (node1.value + curr.value) % 10;
            curr.next = new Node ((node1.value + curr.value) / 10);
            curr = curr.next;
            node1 = node1.next;
        }
        while (node2 != null) {
            curr.value = (node2.value + curr.value) % 10;
            curr.next = new Node((node2.value + curr.value) / 10);
            curr = curr.next;
            node2 = node2.next;
        }
        if (curr.value ==0){
            curr = null;
        }
        return head;
    }
}
