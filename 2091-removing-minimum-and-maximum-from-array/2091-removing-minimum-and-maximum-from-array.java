class Solution {
    public int minimumDeletions(int[] nums) {
        
        int minI = 0;
        int maxI = 0;

        int min = nums[0];
        int max = nums[0];

        for(int  i = 1; i < nums.length; i++){
            
            if(nums[i] > max){
                max = nums[i];
                maxI = i;
            }

            if(nums[i] < min){
                min = nums[i];
                minI = i;
            }
        }

        int n = nums.length;

        int left=Math.min(minI,maxI);
        int right=Math.max(minI,maxI);

         int bothLeft = right + 1;
         int bothRight = n - left;

        int oneEach = (left + 1) + (n - right);

        return Math.min(bothLeft, Math.min(bothRight, oneEach));

    }
}