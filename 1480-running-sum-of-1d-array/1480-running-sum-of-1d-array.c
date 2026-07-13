/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    int* ans = (int*)malloc(numsSize * sizeof(int));

    for(int i=0;i<numsSize;i++){

        int sum=0;

        for(int j=0;j<=i;j++){
            sum+=nums[j];
        }
        ans[i]=sum;
    }

    *returnSize = numsSize;

    return ans;
}