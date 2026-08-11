class Solution {
    public int missingInteger(int[] nums) {
        
        int temp = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){

            if(temp == nums[i]){
                sum += nums[i];
            }
            else{
                break;
            }
            temp++;
        }

      

        boolean found = true;

        while (found) {
            found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == sum) {
                    found = true;
                    sum++;
                    break;
                }
            }
        }

        return sum;
    }
}