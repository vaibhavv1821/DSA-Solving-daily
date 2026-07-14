# [Doubly Linked List from an Array](https://www.geeksforgeeks.org/problems/create-a-doubly-linked-list-from-a-given-array/1)
## Easy
Given an array arr[] of integers, the goal is to create a Doubly Linked List (DLL) where each element of the array is represented as a node. The nodes must be linked in the same sequence as the array, maintaining both forward (next) and backward (prev) connections. Return the head of the constructed doubly linked list.
Examples:
Input:&nbsp;arr[] = [1, 2, 3, 4]Output: 1 &lt;-&gt; 2 &lt;-&gt; 3 &lt;-&gt; 4Explanation: Each array element becomes a node in the doubly linked list. Node 1 connects forward to 2, and node 2 connects back to 1, and so on.
Input:&nbsp;arr[] = [10, 20]Output: 10&nbsp;&lt;-&gt; 20Explanation: The list has two nodes. Node 10 points to 20, and node 20 points back to 10.
Constraints:1 ≤ arr.size() ≤ 1040 ≤ arr[i] ≤ 104