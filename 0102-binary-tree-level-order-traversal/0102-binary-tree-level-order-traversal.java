import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; // Clean, instant exit for empty tree
        
        // Java's best practices suggest ArrayDeque over LinkedList for purely queue operations
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Freeze size right here
            List<Integer> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);
                
                // Add children on-the-fly without helper methods
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(currentLevel);
        }
        
        return result;
    }
}