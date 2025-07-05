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

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;

        list.add(root.val);
        list = addItems(list, preorderTraversal(root.left));
        list = addItems(list, preorderTraversal(root.right));

        return list; 
    }

    public List<Integer> addItems(List<Integer> to, List<Integer> from){
        
        for(Integer num : from){
            to.add(num);
        }

        return to;
    }
}