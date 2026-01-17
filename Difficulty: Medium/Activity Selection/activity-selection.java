import java.util.*;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = start[i];
            arr[i][1] = finish[i];
        }

        // Sort by finish time
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        int count = 1;
        int lastFinish = arr[0][1];

        for(int i = 1; i < n; i++){
            if(arr[i][0] > lastFinish){
                count++;
                lastFinish = arr[i][1];
            }
        }

        return count;
    }
}
