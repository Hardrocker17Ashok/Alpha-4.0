// package BinaryTree;

import java.util.*;;

public class TopView {

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

    static public class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }

    }

    public static void Get_TopView(Node node) {
        if (node == null) {
            return;
        }
        Queue<Info> qu = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        qu.add(new Info(node, 0));
        qu.add(null);

        while (!qu.isEmpty()) {
            Info curr = qu.remove();
            if (curr == null) {
                if (qu.isEmpty()) {
                    break;
                } else {
                    qu.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {// first time my hd is occurring
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    qu.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    qu.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        // print all view value
        for (int i = min; i <= max; i++) {
            if (map.containsKey(i)) {
                System.out.print(map.get(i).data + " ");
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right.right = new Node(7);
        // root.right.right.left = new Node(7);
        // root.right.right.right.right = new Node(7);

        Get_TopView(root);
    }
}
