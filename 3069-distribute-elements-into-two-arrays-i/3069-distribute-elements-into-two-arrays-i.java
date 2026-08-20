class Solution {
    public int[] resultArray(int[] nums) {

        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        
        int i1 = 0;
        int i2 = 0;

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        for(int i = 2; i < nums.length; i++){

            if(arr1[i1] > arr2[i2]){
                arr1[++i1] = nums[i];
            }
            else{
                arr2[++i2] = nums[i];
            }
        }

        int[] result = new int[nums.length];

    for(int i = 0; i < arr1.length; i++) {
        result[i] = arr1[i];
    }

    for(int i = 0; i <= i2; i++) {
        result[i1 + i + 1] = arr2[i];
    }

    return result;
    }
}