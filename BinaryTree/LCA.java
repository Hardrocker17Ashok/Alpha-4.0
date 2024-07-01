package BinaryTree;

import java.util.*;

import org.w3c.dom.Node;;

public class LCA {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static boolean getpath(Node node, int n, ArrayList<Node> path) {
        if (node == null) {
            return false;
        }
        path.add(node);
        if (node.data == n) {
            return true;
        }
        boolean foundleft = getpath(node.left, n, path);
        boolean foundright = getpath(node.right, n, path);
        if (foundleft || foundright) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static int lca1(Node node, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(node, n1, path1);
        getpath(node, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        Node ll = path1.get(i - 1);
        return ll.data;
    }

    // Another Approach to find LCA
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        // leftLCA=val rightLca = null
        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 5, n2 = 7;
        // int result = lca1(root, n1, n2);
        // System.out.println(result);
        // Node result=lca2(root, n1, n2);
        System.out.println(lca2(root, n1, n2).data);
    }

}
