class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int n1=n;

        while(n1!=0){
            int rem=n1%10;
            sum+=rem;
            product*=rem;
            n1/=10;
        }
        int ans=sum+product;
        if(n%ans==0){
            return true;
        }
        return false;
    }
}