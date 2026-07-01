class Solution {
     List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        order(root);
        return result;
    }

    public void order (TreeNode root){
        if(root ==null){
            return;
        }

        order(root.left);
        order(root.right);
        result.add(root.val);       
    }
}