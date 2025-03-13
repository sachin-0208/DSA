public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);

}
