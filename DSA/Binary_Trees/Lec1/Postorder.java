import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;

        list = addItems(list, postorderTraversal(root.left));
        list = addItems(list, postorderTraversal(root.right));
        list.add(root.val);

        return list; 
    }

    public List<Integer> addItems(List<Integer> to, List<Integer> from){
        
        for(Integer num : from){
            to.add(num);
        }

        return to;
    }
}