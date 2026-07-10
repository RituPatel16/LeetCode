void sortColors(int* nums, int numsSize) {
    int x,j;
    for(int i = 1; i < numsSize; i++){
        x = nums[i];
        j = i - 1;

        while( j > -1 && x < nums[j]){
            nums[j+1] = nums[j];
            j--;
        }
        nums[j + 1] = x;
    }
}