class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];

            int j = 0;

            while (x != nums2[j]) {
                j++;
            }

            if (j == nums2.length - 1) {

                ans[index] = -1;

            }

            boolean flag = false;

            for (int k = j + 1; k < nums2.length; k++) {

                if (nums2[k] > x) {

                    ans[index] = nums2[k];
                    flag = true;
                    break;

                }
            }

            if (!flag) {

                ans[index] = -1;
            }

            index++;

        }

        return ans;
    }

}