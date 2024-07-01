import java.util.*;

import org.w3c.dom.Node;

public class MinDistBeetTwoNode {

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

    public static int Lcadist(Node node, int n) {
        if (node == null) {
            return -1;
        }
        if (node.data == n) {
            return 0;
        }
        int leftdist = Lcadist(node.left, n);
        int rightdist = Lcadist(node.right, n);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }
    }

    public static int mindist(Node node, int n1, int n2) {
        Node lca = lca2(node, n1, n2);
        int leftdist = Lcadist(lca, n1);
        int rightdist = Lcadist(lca, n2);
        return leftdist + rightdist;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 2, n2 = 3;
        System.out.println(mindist(root, n1, n2));
    }
}
