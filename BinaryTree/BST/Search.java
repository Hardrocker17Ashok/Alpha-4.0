package BST;

public class Search {
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

    public static boolean SearchNode(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }
        boolean left = SearchNode(node.left, key);
        boolean right = SearchNode(node.right, key);

        // WE CAN RIGHT THIS
        if (left || right) {
            return true;
        } else {
            return false;
        }

        // ALSO WE CAN RIGHT THIS
        // return left || right;

        // AND ALSO WE CAN RIGHT THIS
        // return SearchNode(node.left, key) || SearchNode(node.right, key);
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
        System.out.println();
        if (SearchNode(root, 7)) {
            System.out.println("Key is presant");
        } else {
            System.out.println("Key is not presant");
        }
    }
}
