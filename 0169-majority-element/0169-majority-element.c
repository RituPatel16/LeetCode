int majorityElement(int* nums, int numsSize) {
    int t = numsSize/2;

    int count = 0;
    int n = 0;

    for(int i = 0; i < numsSize; i++){

         if (count == 0) {
            n = nums[i];
        }

        if (nums[i] == n)
            count++;
        else
            count--;
    }

    return n;
}