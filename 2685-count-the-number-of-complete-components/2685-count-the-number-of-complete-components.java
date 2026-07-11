import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        // Step 1: Build the adjacency list representation of the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int completeComponentsCount = 0;

        // Step 2: Iterate through all nodes to find each connected component
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] counts = new int[2]; // counts[0] = vertex count, counts[1] = edge count
                dfs(i, adj, visited, counts);
                
                int V = counts[0];
                // Since it's an undirected graph, each edge is traversed twice in DFS
                int E = counts[1] / 2; 

                // Step 3: Check if the component is complete
                if (E == (V * (V - 1)) / 2) {
                    completeComponentsCount++;
                }
            }
        }

        return completeComponentsCount;
    }

    private void dfs(int node, List<List<Integer>> adj, boolean[] visited, int[] counts) {
        visited[node] = true;
        counts[0]++; // Increment vertex count
        counts[1] += adj.get(node).size(); // Accumulate the degree of this node

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, counts);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna