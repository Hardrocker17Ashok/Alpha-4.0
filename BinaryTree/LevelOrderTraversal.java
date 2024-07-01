package BinaryTree;

import java.util.*;

public class LevelOrderTraversal {

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

    static int ind = -1;

    public static Node build(int arr[]) {
        ind++;
        if (arr[ind] == -1) {
            return null;
        }
        Node newnode = new Node(arr[ind]);
        newnode.left = build(arr);
        newnode.right = build(arr);
        return newnode;
    }

    public static void LevelOrder(Node Root) {
        if (Root == null) {
            return;
        }
        Queue<Node> qu = new LinkedList<>();
        qu.add(Root);
        qu.add(null);
        while (!qu.isEmpty()) {
            Node curr = qu.remove();
            if (curr == null) {
                System.out.println(" ");
                if (qu.isEmpty()) {
                    break;
                } else {
                    qu.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    qu.add(curr.left);
                }
                if (curr.right != null) {
                    qu.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        // given preorder traversal
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // this is preorder traversal of given array

        // 1
        // / \
        // 2 3
        // / \ \
        // 4 5 6

        // -1 => NULL

        // we know that in preorder first node is root node
        // so
        LevelOrderTraversal ob = new LevelOrderTraversal();
        Node Root = ob.build(arr);
        ob.LevelOrder(Root);
    }
}
