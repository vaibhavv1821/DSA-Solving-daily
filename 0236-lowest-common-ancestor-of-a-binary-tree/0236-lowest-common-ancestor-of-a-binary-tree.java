class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        
        // If the current node is p or q, we found one of them
        if (root.equals(p) || root.equals(q)) {
            return root;
        }
        
        // Corrected: Added '=' and fixed the parameter 'q'
        TreeNode lans = lowestCommonAncestor(root.left, p, q);
        TreeNode rans = lowestCommonAncestor(root.right, p, q);
        
        // If both sides return a node, this root is the LCA
        if (lans != null && rans != null) {
            return root;
        }
        
        // Otherwise, return the non-null result (if any)
        return (lans != null) ? lans : rans;
    }
}