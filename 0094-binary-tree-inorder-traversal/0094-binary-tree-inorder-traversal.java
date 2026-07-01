class Solution {
     List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        order(root);
        return result;
    }

    public void order (TreeNode root){
        if(root ==null){
            return;
        }

        order(root.left);
        result.add(root.val);       
        order(root.right);
    }
}