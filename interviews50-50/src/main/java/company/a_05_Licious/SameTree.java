package company.a_05_Licious;

public class SameTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

    }
    public static void main(String[] args) {

    }
    public TreeNode invert(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);

        root.left= right;
        root.right=left;
        return root;
    }
}
