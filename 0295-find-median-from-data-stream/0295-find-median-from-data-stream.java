import java.util.*;

class MedianFinder {

    // Max heap for left half
    private PriorityQueue<Integer> maxHeap;

    // Min heap for right half
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {

        // Max heap (reverse order)
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Min heap (natural order)
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Step 1: Add to maxHeap
        maxHeap.offer(num);

        // Step 2: Move largest from left to right
        minHeap.offer(maxHeap.poll());

        // Step 3: Balance sizes
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {

        // If odd, maxHeap has one extra
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }

        // If even
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
