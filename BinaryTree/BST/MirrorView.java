package BST;

import java.util.ArrayList;

public class MirrorView {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node createMirror(Node root) { // 0(n)
        if (root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // preorder
    static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.left = new Node(12);
        root.right.right = new Node(15);

        System.out.println("Beforee Change");
        Inorder(root);
        System.out.println();
        root = createMirror(root);
        System.out.println("After change Mirror tree");
        Inorder(root);
    }
}
