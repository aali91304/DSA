
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}


public class BinaryTreeMirrorDay4 {

    static void mirror(TreeNode node) {
        if (node == null) {
            return;
        }

        // Swap left and right subtrees
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively mirror the left and right subtrees
        mirror(node.left);
        mirror(node.right);
    }

    static void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        // Inorder traversal
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(60);

        System.out.println("Original tree in inorder:");
        inOrder(root);
        System.out.println();

        mirror(root);

        System.out.println("Mirror tree in inorder:");
        inOrder(root);

    }
}
