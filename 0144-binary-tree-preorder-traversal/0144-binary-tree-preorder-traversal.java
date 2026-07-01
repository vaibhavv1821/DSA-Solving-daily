class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        order(root);
        return result;
    }

    public void order(TreeNode root) {

        if (root == null) {
            return;
        }

        result.add(root.val);

        order(root.left);
        order(root.right);
    }
}