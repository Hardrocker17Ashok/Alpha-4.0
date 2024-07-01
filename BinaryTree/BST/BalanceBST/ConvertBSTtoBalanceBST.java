package BST.BalanceBST;

import java.util.*;

public class ConvertBSTtoBalanceBST {

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

    public static void getInorder(Node node, ArrayList<Integer> al) {
        if (node == null) {
            return;
        }
        getInorder(node.left, al);
        al.add(node.data);
        getInorder(node.right, al);
    }

    public static Node balanceBst(ArrayList<Integer> al, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(al.get(mid));
        root.left = balanceBst(al, st, mid - 1);
        root.right = balanceBst(al, mid + 1, end);
        return root;
    }

    public static Node genrate_balance_BST(Node node) {
        ArrayList<Integer> al = new ArrayList<>();
        // first we know inorder of bst is sorted
        // so we will store inorder element in arraylist
        // than we will balance
        getInorder(node, al);
        node = balanceBst(al, 0, al.size() - 1);
        return node;
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // this is unbalance BST

        // 10
        // / \
        // 8 12
        // / \
        // 6 14
        // / \
        // 4 16
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(6);
        root.left.left.left = new Node(4);

        root.right = new Node(12);
        root.right.right = new Node(14);
        root.right.right.right = new Node(16);

        // we will create balance
        Node NewRoot = genrate_balance_BST(root);
        preorder(NewRoot);

    }
}
