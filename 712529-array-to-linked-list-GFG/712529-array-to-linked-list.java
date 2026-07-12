class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        if(arr.length==0){
            return null;
        }
        Node start=new Node(arr[0]);
        Node curr=start;
        for(int i=1;i<arr.length;i++)
        {
            curr.next=new Node(arr[i]);
            curr=curr.next;
        }
        return start;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna