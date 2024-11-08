
public class MaximumDepthofBinaryTree {


 static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.right), maxDepth(root.left))+1;
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(7);
        root.left.left.left = new TreeNode(16);

        int depth = maxDepth(root);
        System.out.println("Maximum Depth of the Binary Tree: " + depth);
    }
}
