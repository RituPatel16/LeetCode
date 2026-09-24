class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int n = 0;

            while(temp != 0){
                int rem = temp % 10;
                n = n + rem;
                temp /= 10;

            }

            if(i == n){
                return i;
                
            }
        }

        return -1;
    }
}