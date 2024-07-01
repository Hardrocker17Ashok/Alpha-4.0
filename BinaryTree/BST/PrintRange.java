package BST;

public class PrintRange {
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

    public static Node BuildTree(Node node, int data) {
        if (node == null) {
            Node newnode = new Node(data);
            return newnode;
        }
        if (data > node.data) {
            node.right = BuildTree(node.right, data);
        } else {
            node.left = BuildTree(node.left, data);
        }
        return node;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

     // inorder
     static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);

    }

    public static void main(String[] args) {
        Node root = null;
        root = BuildTree(root, 5);
        root = BuildTree(root, 1);
        root = BuildTree(root, 3);
        root = BuildTree(root, 10);
        root = BuildTree(root, 11);
        root = BuildTree(root, 6);
        root = BuildTree(root, 7);
        root = BuildTree(root, 2);

        Inorder(root);
        System.out.println();
        printInRange(root, 2, 8);
    }
}
