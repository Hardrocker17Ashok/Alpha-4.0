package BST;

import java.util.*;;
import java.util.ArrayList;

public class RootToLeafPath {
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

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
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

        // Inorder(root);

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println();
        printRoot2Leaf(root, al);
    }
}
