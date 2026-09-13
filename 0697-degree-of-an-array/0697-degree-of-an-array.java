class Solution {
    public int findShortestSubArray(int[] nums) {
         HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }

        int degree = 0;

        for (int value : freq.values()) {
            if (value > degree) {
                degree = value;
            }
        }

        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {

            if (freq.get(nums[i]) == degree) {

                int last = i;

                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        last = j;
                    }
                }

                int length = last - first.get(nums[i]) + 1;

                if (length < ans) {
                    ans = length;
                }
            }
        }

        return ans;
    }
}