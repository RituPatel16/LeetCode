class Solution {
    public int countElements(int[] nums) {

        if(nums.length == 1){
            return 0;
        }

        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        if(min == max){
            return 0;
        }

        int maxC = 0;
        int minC = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                maxC++;
            }
            if(nums[i] == min){
                minC++;
            }
        }

        return nums.length - maxC - minC;
    }
}