/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Subscribe to see which companies asked this question
 */

import java.util.LinkedList;

public class Solution {

    public int maxDepth(TreeNode root) {

        //DFS
//        if ( root == null){
//            return 0;
//        }
//        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        //BFS
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root != null) {
            queue.addLast(root);
            queue.addLast(null); // Level breaker
        }

        int depth = 0;
        while (!queue.isEmpty()) {
            TreeNode current = queue.removeFirst();
            if (current == null) {
                ++depth;
                if (!queue.isEmpty()) {
                    queue.addLast(null);
                }
            } else {
                if (current.left != null) {
                    queue.addLast(current.left);
                }
                if (current.right != null) {
                    queue.addLast(current.right);
                }
            }
        }

        return depth;
    }
}
