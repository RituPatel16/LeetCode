int findNumbers(int* nums, int numsSize) {
    
    int count = 0;

    for(int i = 0; i < numsSize; i++){
        int n = nums[i];
        int d = 0;
        while(n != 0){
            int rem = n % 10;
            n /= 10;
            d++;
        }

        if(d % 2 == 0){
            count++;
        }
    }

    return count;
}