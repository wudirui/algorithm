package test1.tree;

/**
 * 广度优先
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
 int val;
  TreeNode left;
  TreeNode right;
 TreeNode(int x) { val = x; }
}

public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null)
            return list;
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left!=null)
                queue.add(node.left);
                if (node.right!=null)
                queue.add(node.right);
            }
            list.add(tmp);
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
