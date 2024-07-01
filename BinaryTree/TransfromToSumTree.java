// import javax.xml.crypto.dsig.Transform;

public class TransfromToSumTree {
    // package BinaryTree;

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

    public static int Transform(Node root) {
        if (root == null) {
            return 0;
        }
        int left = Transform(root.left);
        int right = Transform(root.right);
        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + left + newRight + right;
        return data;
    }

    static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right.right = new Node(7);
        // root.right.right.left = new Node(7);
        // root.right.right.right.right = new Node(7);

        Inorder(root);
        System.out.println();
        Transform(root);
        System.out.println();
        Inorder(root);
    }
}
