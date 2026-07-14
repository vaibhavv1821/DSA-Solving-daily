class Solution {
    public Node createDLL(int arr[]) {

        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {

            Node newNode = new Node(arr[i]);

            curr.next = newNode;
            newNode.prev = curr;

            curr = newNode;
        }

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna