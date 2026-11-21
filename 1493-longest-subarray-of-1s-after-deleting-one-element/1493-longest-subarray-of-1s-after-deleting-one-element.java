class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxCount = 0;
        int l = 0;

        for(int r = 0; r < n; r++){
            if(nums[r] == 0){
                count++;
            }

            while(count > 1){
                if(nums[l] == 0){
                    count--;
                }
                l++;
            }

            maxCount = Math.max(maxCount, r - l);
        }

        return maxCount;

        // int i = 0, j;

        // while(nums[j] != 0){
        //     j++;
        // }

        // while(i < n){
        //     if(nums[i] == 1){
        //         count++;
        //         i++;
        //     }
        //     if(i == j){
        //         j++;
        //         while(nums[j] != 0){
        //             j++;
        //         }
        //     }
        // }

        // if(nums[0] == 0){
        //     idx = 0;
        // }
        // else{
        //     count++;
        // }

        // maxCount = count;

        // for(int i = 1; i < n; i++){
        //     if(idx != -1){
                
        //     }
        //     if(nums[i] == 1){
        //         count++;
        //     }
        //     if(nums[i] == 0){
        //         idx = i;
        //     }
        // }

        
    } 
}