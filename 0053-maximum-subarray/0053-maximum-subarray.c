int maxSubArray(int* nums, int numsSize) {

    int currentSum = 0;
    int maxSum = nums[0];

    for(int  i = 0; i < numsSize; i++){
        if(nums[i] > currentSum + nums[i]){
            currentSum = nums[i]; 
        }
        else{
            currentSum += nums[i];
        }

        if(currentSum > maxSum){
            maxSum = currentSum;
        }
    }

    return maxSum;
}