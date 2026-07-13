/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int* ans = (int*)malloc(2 * sizeof(int));

    ans[0] = ans[1] = -1;

    for(int i = 0; i < numsSize; i++){
        if(nums[i] == target){
            ans[0] = i;
            break;
        }
    }

    for(int j = numsSize-1 ; j >= 0; j--){
        if(nums[j] == target){
            ans[1] = j;
            break;
        }
    }
    
    *returnSize = 2;

    return ans;
}