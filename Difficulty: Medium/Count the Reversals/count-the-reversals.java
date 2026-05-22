class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length()%2!=0){
            return -1;
        }
        
         int ans = 0, open = 0, close=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{'){
                open+=1; 
            } else {
                // insert incase of invalid pair }} or close comes before open.
             
                if(open<=0) {
                    close++;
                } else {
                    // pop in case of valid pair {}
                    open--;
                }
            }
        }
       
     
        ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }
}