class Solution {
    public int countPairs(List<Integer> arr, int target) {
        int count =0;
        for(int i=0; i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int sum = arr.get(i) + arr.get(j);
                if(sum < target){
                    count++;
                }
            }
        }
        return count;
    }
}