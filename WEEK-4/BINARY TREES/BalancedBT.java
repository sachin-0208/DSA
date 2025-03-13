public class BalancedBT {
    public boolean checker(TreeNode root){

    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lefth = height(root.left);
        int righth= height(root.right);
        if(lefth==-1||righth==-1) return -1;
        if(Math.abs(lefth-righth)>1) return -1;
        return Math.max(lefth,righth)+1;
    }
}
 /*
  * public boolean isBalanced(TreeNode root) {
        return height(root)!=-1? true:false;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lefth=height(root.left);
        int righth=height(root.right);
        if(lefth==-1||righth==-1) return -1;
        if(Math.abs(lefth-righth)>1) return -1;
        return Math.max(lefth,righth)+1;
    }
  */