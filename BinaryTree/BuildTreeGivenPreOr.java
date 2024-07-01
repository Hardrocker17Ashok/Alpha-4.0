package BinaryTree;

public class BuildTreeGivenPreOr {

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

    static class Binary {
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

        // inorder
        static void Inorder(Node root) {
            if (root == null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);

        }

        // preorder
        static void Preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);

        }

        // postorder
        static void Postorder(Node root) {
            if (root == null) {
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");

        }

    }

    public static void main(String[] args) {
        // given preorder traversal
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // -1 => NULL

        // we know that in preorder first node is root node
        // so
        Binary ob = new Binary();
        Node Root = ob.build(arr);
        System.out.println(Root.data);
        // ob.Inorder(Root);
        ob.Preorder(Root);
        // ob.Postorder(Root);
    }
}
