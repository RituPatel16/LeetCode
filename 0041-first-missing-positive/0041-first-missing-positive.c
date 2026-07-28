int firstMissingPositive(int* nums, int numsSize) {

    int i = 0;
   
    while(i < numsSize){

        int index = nums[i] - 1;

        if(nums[i] > 0 && nums[i] < numsSize && nums[i] != nums[index]){
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        else{
            i++;
        }

    }

    for(int i = 0; i < numsSize; i++){

        if(nums[i] != i + 1){
            return i+1;
        }

    }

    return numsSize+1;

    


}