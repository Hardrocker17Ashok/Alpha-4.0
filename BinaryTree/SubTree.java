package BinaryTree;

public class SubTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static boolean isidentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }
        if (!isidentical(root.left, subroot.left)) {
            return false;
        }
        if (!isidentical(root.right, subroot.right)) {
            return false;
        }
        return true;
    }

    public static boolean Check_SubTree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isidentical(root, subroot)) {
                return true;
            }
        }
        boolean left = Check_SubTree(root.left, subroot);
        boolean right = Check_SubTree(root.right, subroot);
        return left || right;
    }

    public static void main(String[] args) {

        // Actual tree structure
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Sub tree
        Node subnode = new Node(2);
        subnode.left = new Node(4);
        subnode.right = new Node(5);
        System.out.println(Check_SubTree(root, subnode));
    }
}
