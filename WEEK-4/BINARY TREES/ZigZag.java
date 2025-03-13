import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class ZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        boolean lr=true;
        while(!queue.isEmpty()){
            int cs = queue.size();
            List<Integer> list = new ArrayList<>(cs);
            for(int i=0;i<cs;i++){
                TreeNode temp = queue.poll();
                if(lr)list.add(temp.val);
                if(!lr) list.add(0,temp.val);
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
                
            }
            result.add(list);
            lr=!lr;
        }
        return result;
    }
}
