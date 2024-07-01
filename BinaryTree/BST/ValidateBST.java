package BST;

import java.util.ArrayList;

public class ValidateBST {
    static ArrayList<Integer> al = new ArrayList<>();

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

    // find valid preorder from help of inorder
    // because we know that for valid bst the tre preorder should be accending order
    static boolean CheckBST(Node node) {
        Preorder(node);
        System.out.println();
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) > al.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // preorder
    static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        Preorder(root.left);
        System.out.print(root.data + " ");
        al.add(root.data);
        Preorder(root.right);
    }

    // Another way to find
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.left = new Node(12);
        root.right.right = new Node(15);

        // WITH INORDER
        // if (CheckBST(root)) {
        // System.out.println("This is a valid BST");
        // } else {
        // System.out.println("This is not a valid BST");
        // }

        // FROM ANOTHER WAY
        if (isValidBST(root, null, null)) {
            System.out.println("This is a valid BST");
        } else {
            System.out.println("This is not a valid BST");
        }
    }
}
