package BinaryTree;

public class Diameter {

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

    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int Get_Diameter(Node node) {
        if (node == null) {
            return 0;
        }
        int leftdi = Get_Diameter(node.left);
        int lefthi = Height(node.left);
        int rightdi = Get_Diameter(node.right);
        int righthi = Height(node.right);

        int selfdi = (lefthi + righthi) + 1;
        return Math.max(selfdi, Math.max(righthi, leftdi));
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(7);
        root.right.right.left = new Node(7);
        root.right.right.right.right = new Node(7);

        System.out.println(Get_Diameter(root));
    }
}
