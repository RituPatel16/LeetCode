class Solution {
    public int smallestNumber(int n, int t) {

        int i = n;

        while(true){

            int temp = i;
            int prod = 1;

            while(temp != 0){
                int rem = temp % 10;
                prod *= rem;
                temp /= 10;
            }

            if(prod % t == 0){
                return i;
                
            }

            i++;
        }

        
    }
}