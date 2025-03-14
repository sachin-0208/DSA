public class CountGoodNodes {
    public int goodNodes(TreeNode root) {
        return count(root, root.val);
    }
    public static int count(TreeNode root,int maxv){
        if(root==null) return 0;
        int count=0;
        if(root.val>=maxv) count++;
        int nm = Math.max(root.val,maxv);
        count+=count(root.left,nm); 
        count+=count(root.right,nm);
        return count; 
    }
    public static int count(TreeNode root,int maxv){
        if(root==null) return 0;
        if(root.val<maxv){
            return count(root.left,maxv)+count(root.right,maxv);
        }
        else{
            return 1+count(root.left,root.val)+count(root.right,root.val);
        }
    }
}
/*
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.

 

Example 1:



Input: root = [3,1,4,3,null,1,5]
Output: 4
Explanation: Nodes in blue are good.
Root Node (3) is always a good node.
Node 4 -> (3,4) is the maximum value in the path starting from the root.
Node 5 -> (3,4,5) is the maximum value in the path
Node 3 -> (3,1,3) is the maximum value in the path.
Example 2:



Input: root = [3,3,null,4,2]
Output: 3
Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
Example 3:

Input: root = [1]
Output: 1
Explanation: Root is considered as good.
 

Constraints:

The number of nodes in the binary tree is in the range [1, 10^5].
Each node's value is between [-10^4, 10^4].
 */
/*
 * so we basically have 2 ways to find the number of good nodes-
 * 1)
 * what we can actually do is go by the larger method in which we check for root.val being greater than or equal to the max and if
 * it does then inccrease the count by 1;
 */