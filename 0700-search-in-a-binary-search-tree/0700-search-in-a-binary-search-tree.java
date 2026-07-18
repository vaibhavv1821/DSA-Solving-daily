 class Solution {
    public TreeNode searchBST(TreeNode root, int targ) {
        if(root == null) return null;

        if (root.val == targ) return root;

        if(root.val > targ) {
            return searchBST(root.left, targ);
        }
        if(root.val < targ) {
            return searchBST(root.right, targ);
        }
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna