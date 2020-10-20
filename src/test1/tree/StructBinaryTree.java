package test1.tree;

/**
 * 重构二叉树
 */

class Node {
    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
    }
}

public class StructBinaryTree {
    public static Node structTree(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0 || arr2 == null || arr2.length == 0)
            return null;
        Node node = new Node(arr1[1]);
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[0] == arr2[i]) {
                int start1 = 1;
                int end1 = i;
                int start2 = 0;
                int end2 = i - 1;
                node.left = getNode(arr1, start1, end1, arr2, start2, end2);
                node.right = getNode(arr1, end1 + 1, arr1.length - 1, arr2, i + 1, arr2.length - 1);
            }
        }
        return node;

    }

    private static Node getNode(int[] arr1, int start1, int end1, int[] arr2, int start2, int end2) {
        Node node = null;
        if (start1 <= end1 && start2 <= end2) {
            node = new Node(arr1[start1]);
            for (int i = start2; i < end2; i++) {
                if (arr1[start2] == arr2[i]) {
                    node.left = getNode(arr1, ++start1, start1+i, arr2, start2, i-1);
                    node.right = getNode(arr1, start1+i+1, arr1.length - 1, arr2, i + 1, end2);
                }
            }
        }
        return node;
    }

}
