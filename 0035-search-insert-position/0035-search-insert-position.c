int searchInsert(int* nums, int numsSize, int target) {

    int ans;
    
    for(int i = 0; i < numsSize; i++){

        if(nums[i] == target){
            ans = i;
        }

        if(i < (numsSize-1) && nums[i] < target && nums[i + 1] > target){
            ans = i+1;
        }

        if(nums[numsSize-1] < target){
            ans = numsSize;
        }

        
    }

    return ans;
}