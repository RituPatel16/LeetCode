class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0, right = (long)Math.sqrt(c);

        while(left <= right){
            long n = (left*left) + (right*right);

            if(n == c){
                return true;
            }
            else if(n < c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}