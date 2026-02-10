import java.util.*;

class Solution {

    public int majorityElement(int[] arr) {

        int count =1;
        int output = arr[0];

        for (int i=1; i<arr.length ; i++) {
            if(count <= 0){
                // count = 0;
                output = arr[i];
            }
            if(arr[i] == output){
                count++;
            }else{
                count--;
            }
        }
        return output;
    }
}
