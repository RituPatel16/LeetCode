/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {

    int n = 2*(numsSize);
    int* ans = (int*)malloc(n * sizeof(int));

    for(int i=0;i<numsSize;i++){
        ans[i] = nums[i];
    }

    for(int i=0; i<numsSize; i++){
        ans[numsSize+i] = nums[i];
    }

    *returnSize = n;

    return ans;


}