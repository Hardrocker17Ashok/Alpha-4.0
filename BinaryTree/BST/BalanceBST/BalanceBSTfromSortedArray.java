package BST.BalanceBST;

// import LinkedList.CheckLLisPalindrome.node;

public class BalanceBSTfromSortedArray {
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

    public static Node balanceBst(int[] arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = balanceBst(arr, st, mid - 1);
        root.right = balanceBst(arr, mid + 1, end);
        return root;
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
        int arr[] = { 1, 2, 4, 5, 6, 8, 9 };
        // pass starting index and last index
        Node root = balanceBst(arr, 0, arr.length - 1);
        preorder(root);
    }
}
