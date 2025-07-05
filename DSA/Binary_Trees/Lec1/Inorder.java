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

public class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;

        list = addItems(list, inorderTraversal(root.left));
        list.add(root.val);
        list = addItems(list, inorderTraversal(root.right));

        return list; 
    }

    public List<Integer> addItems(List<Integer> to, List<Integer> from){
        
        for(Integer num : from){
            to.add(num);
        }

        return to;
    }
}