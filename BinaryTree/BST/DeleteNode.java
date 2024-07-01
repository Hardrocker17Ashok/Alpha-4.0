package BST;

public class DeleteNode {
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

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else { 
            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            // case 2 - single child if(root.left = null) €
            else if (root.right == null) {
                return root.left;
            }

            // case 3 - Both childern..
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node InorderSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
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
        delete(root, 10);
        System.out.println();
        Preorder(root);
    }
}
