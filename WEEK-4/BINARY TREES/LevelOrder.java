
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int cs = queue.size();
            List<Integer> current = new ArrayList<>(cs);
            for(int i=0;i<cs;i++){
                TreeNode cn = queue.poll();
                current.add(cn.val);
                if(cn.left!=null) queue.offer(cn.left);
                if(cn.right!=null) queue.offer(cn.right);
            }
            result.add(current);
        }
        return result;

    }
}
