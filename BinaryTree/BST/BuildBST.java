package BST;

public class BuildBST {
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

    // preorder
    static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        Preorder(root.left);
        System.out.print(root.data + " ");
        Preorder(root.right);

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
        Preorder(root);
    }
}
