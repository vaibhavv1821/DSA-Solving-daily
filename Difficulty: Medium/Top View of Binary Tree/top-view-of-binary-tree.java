class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class Solution {

    public ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        int min = 0, max = 0;

        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            if (!map.containsKey(curr.hd))
                map.put(curr.hd, curr.node.data);

            min = Math.min(min, curr.hd);
            max = Math.max(max, curr.hd);

            if (curr.node.left != null)
                q.offer(new Pair(curr.node.left, curr.hd - 1));

            if (curr.node.right != null)
                q.offer(new Pair(curr.node.right, curr.hd + 1));
        }

        for (int i = min; i <= max; i++)
            ans.add(map.get(i));

        return ans;
    }
}