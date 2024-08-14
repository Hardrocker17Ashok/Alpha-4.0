package BinaryTree;

import java.util.Arrays;

public class Exam {

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

        public static Node createTree(int pre[],int in[]){
            if(pre.length==0||in.length==0){
                return null;
            }
            int rootval=pre[0];
            Node root=new Node(rootval);
            int rooindedx=0;
            for(int i=0;i<in.length;i++){
                if(in[i]==rootval){
                    rooindedx=i;
                    break;
                }
            }
            int[]leftInorder=Arrays.copyOfRange(in,0, rooindedx);
            int[]rightInorder=Arrays.copyOfRange(in, rooindedx+1,in.length);
            int[]leftPreorder=Arrays.copyOfRange(pre,1, 1+leftInorder.length);
            int[]rightPreorder=Arrays.copyOfRange(pre,1+leftInorder.length, pre.length);

            root.left=createTree(leftPreorder, leftInorder);
            root.right=createTree(rightPreorder, rightInorder);

            return root;
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

    public static void main(String[] args) {
        // given preorder traversal
        int pre[] = { 1,2,4,5,3,6 };
        int in[] = { 4,2,5,1,3,6 };
        // -1 => NULL

        // we know that in preorder first node is root node
        // so
        // Binary ob = new Binary();
        Node Root =createTree(pre,in);
        
        // ob.Inorder(Root);
        // Preorder(Root);
        Postorder(Root);
    }
}
