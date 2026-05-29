# Structure of binary tree node
'''
class Node:
    def __init__(self, item):
        self.data = item
        self.left = None
        self.right = None
'''
from collections import deque, defaultdict

class Solution:
    def verticalSum(self, root):
        # code here
        if not root:
            return []
        q = deque([(root, 0)])
        ans = []
        
        d = defaultdict(int)
        while q:
            n = len(q)
            for _ in range(n):
                (node, dis) = q.popleft()
                d[dis] = d.get(dis, 0) + node.data
                
                if node.left:
                    q.append((node.left, dis - 1))
                if node.right:
                    q.append((node.right, dis + 1))
        
        for k, v in sorted(d.items(), key = lambda x : x[0]):
            ans.append(v)
        
        return ans