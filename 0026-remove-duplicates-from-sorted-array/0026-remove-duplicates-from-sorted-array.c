int removeDuplicates(int* nums, int numsSize) {
    int arr[numsSize];

    int k=0;

    for(int i=0;i<numsSize-1;i++){

        if(nums[i] != nums[i+1]){

            arr[k]=nums[i];
            k++;
        }
        
    }

    arr[k]=nums[numsSize-1];
    k++;
    

    for(int i=0;i<numsSize;i++){
        nums[i]=arr[i];
    }

    return k;

    // while(i<n){
    //     if(nums[i] == nums[i+1]){
    //         int j=0;
    //         while(nums[i+1] == nums[i+2+j]){
    //             j++;
    //         }
    //         nums[i+1] = nums[i+2+j];
    //     }
    //     i++;
    // }

    
}