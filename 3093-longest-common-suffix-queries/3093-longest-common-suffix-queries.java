class Solution {

    class TrieNode {

        TrieNode[] children = new TrieNode[26];

        // Best candidate info for this node
        int bestIndex;
        int bestLength;

        TrieNode() {
            bestIndex = Integer.MAX_VALUE;
            bestLength = Integer.MAX_VALUE;
        }
    }

    TrieNode root = new TrieNode();

    // Update best candidate at node
    private void update(TrieNode node, int len, int index) {

        // Smaller length wins
        if (len < node.bestLength) {
            node.bestLength = len;
            node.bestIndex = index;
        }

        // If same length, earlier index wins
        else if (len == node.bestLength &&
                 index < node.bestIndex) {

            node.bestIndex = index;
        }
    }

    // Insert reversed word
    private void insert(String word, int index) {

        TrieNode node = root;

        int len = word.length();

        // Empty suffix case
        update(node, len, index);

        // Traverse from end -> suffix trie
        for (int i = len - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.children[c] == null) {
                node.children[c] = new TrieNode();
            }

            node = node.children[c];

            update(node, len, index);
        }
    }

    // Search best suffix match
    private int search(String query) {

        TrieNode node = root;

        for (int i = query.length() - 1; i >= 0; i--) {

            int c = query.charAt(i) - 'a';

            if (node.children[c] == null) {
                break;
            }

            node = node.children[c];
        }

        return node.bestIndex;
    }

    public int[] stringIndices(String[] wordsContainer,
                               String[] wordsQuery) {

        // Build Trie
        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        // Process queries
        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }
}