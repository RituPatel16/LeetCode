class Solution {
    public int missingMultiple(int[] nums, int k) {
        int a = 1;

        while (true) {
            int n = k * a;
            boolean flag = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == n) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return n;
            }

            a++;
        }
    }
}