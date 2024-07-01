package Tries;

public class QuestionTrie {
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

    // QQ1. Word break exist
    public static boolean wordBreak(String s) {
        if (s.length() == 0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            String firstPart = s.substring(0, i);
            String secondPart = s.substring(i);
            if (search(firstPart) && wordBreak(secondPart)) {
                return true;
            }
        }
        return false;
    }

    // QQ2. check prifix present or not in string

    public static boolean checkPrefix(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            Node node = curr.child[index];
            if (node == null) {
                return false;
            }
            curr = curr.child[index];
        }
        return true;
    }

    // QQ3.find all uniqe substring from given String
    public static int countForSubstring(Node word) {
        if (word == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (word.child[i] != null) {
                count += countForSubstring(word.child[i]);
            }
        }
        return count + 1;
    }

    // QQ4.find Longest word given string

    public static String ans = " ";

    public static void LongestWord(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (node.child[i] != null && node.child[i].eow == true) {
                sb.append((char) (i + 'a'));
                if (sb.length() > ans.length()) {
                    ans = sb.toString();
                }
                LongestWord(node.child[i], sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "i", "m", "mo", "mob", "like", "sam", "samsung", "sung", "mobile", "mobi", "mobil" };
        // String key = "ilikesamsung";
        for (String s : words) {
            insert(s);
        }
        // System.out.println(wordBreak(key));
        // System.out.println(checkPrefix("mo"));

        // String s = "ababa";
        // for (int i = 0; i < s.length(); i++) {

        // // find all suffix of string
        // String suffix = s.substring(i);

        // // create trie of all suffix
        // insert(suffix);
        // }
        // int total = countForSubstring(root);
        // System.out.println(total);

        StringBuilder sb = new StringBuilder();
        LongestWord(root, sb);
        System.out.println(ans);
    }
}
