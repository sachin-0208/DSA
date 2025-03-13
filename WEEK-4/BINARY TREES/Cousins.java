import javax.swing.tree.TreeNode;

public class Cousins {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);
        return(
            (level(root,xx,0)==level(root,yy,0)) 
            && (!isSibling(root,xx,yy)) 
        );
    }
    TreeNode findNode(TreeNode root,int x){
        if(root==null) return null;
        if(root.val==x) return root;
        TreeNode temp = findNode(root.left,x);
        if(temp!=null) return temp;
        return findNode(root.right,x);
    }
    int level(TreeNode root,TreeNode xx, int lev){
        if(root==null) return 0;
        if(root==xx) return lev;
        int l = level(root.left,xx,lev+1);
        if(l!=0) return l;
        return level(root.right,xx,lev+1);
    }
    boolean isSibling(TreeNode root,TreeNode xx,TreeNode yy){
        if(root==null) return false;
        return(
            (root.left==xx && root.right==yy) ||
            (root.left==yy && root.right==xx) ||
            (isSibling(root.left,xx,yy)) ||
            (isSibling(root.right,xx,yy))
        );
    }   
}

/*
 * Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

Two nodes of a binary tree are cousins if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.

 

Example 1:


Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:


Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:


Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 

Constraints:

The number of nodes in the tree is in the range [2, 100].
1 <= Node.val <= 100
Each node has a unique value.
x != y
x and y are exist in the tree.
 */