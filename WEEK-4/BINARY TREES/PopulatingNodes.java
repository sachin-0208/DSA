import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class PopulatingNodes {
    public Node connect(Node root) {
        if(root==null) return null;
        Node temp = root;
        while(temp.left!=null){
            Node current = temp;
            while(current!=null){
                current.left.next=current.right;
                if(current.next!=null){
                    current.right.next=current.next.left;
                }
                current=current.next;
            }
            temp = temp.left;
        }
        return root;
    }
    // if (root == null) return null;
        
    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);
        
    //     while (!queue.isEmpty()) {
    //         int size = queue.size();
    //         Node prev = null;
            
    //         for (int i = 0; i < size; i++) {
    //             Node node = queue.poll();
    //             if (prev != null) prev.next = node;
    //             prev = node;
                
    //             if (node.left != null) queue.add(node.left);
    //             if (node.right != null) queue.add(node.right);
    //         }
    //     }
    //      return root;
    // }
}

/*
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

 https://assets.leetcode.com/uploads/2019/02/14/116_sample.png

Example 1:


Input: root = [1,2,3,4,5,6,7]
Output: [1,#,2,3,#,4,5,6,7,#]
Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
Example 2:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 212 - 1].
-1000 <= Node.val <= 1000
 

Follow-up:

You may only use constant extra space.
The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.
 */