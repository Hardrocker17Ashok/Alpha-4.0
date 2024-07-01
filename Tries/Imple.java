package Tries;

public class Imple {
   static class Node {
        Node child[];
        boolean eow;

        public Node() {
            child = new Node[26];
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.child[index] == null) {
                curr.child[index] = new Node();
            }
            if (i == word.length() - 1) {
                curr.child[index].eow = true;
            }
            curr = curr.child[index];
        }
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            Node node = curr.child[index];
            if (node == null) {
                return false;
            }
            if (i == word.length() - 1 && node.eow == false) {
                return false;
            }
            curr = curr.child[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "ashok", "sharma", "ash", "sharpo", "te" };
        for (String s : words) {
            insert(s);
        }
        System.out.println(search("ash"));
    }
}
