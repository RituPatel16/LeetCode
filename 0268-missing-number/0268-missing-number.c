int missingNumber(int* nums, int numsSize) {

    int max = numsSize;
    int sum = (max * (max+1)) / 2;

    for(int i = 0; i < numsSize; i++){
        sum = sum - nums[i];
    }

    return sum;


}