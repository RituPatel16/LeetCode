bool isPalindrome(long long x) {
    long long org=x,rev=0,rem;

    while(org!=0){
        rem=org%10;
        rev=rev*10+rem;
        org=org/10;  
    }

    if(x<0){
        return false;
    }
    else if(x==rev){
        return true;
    }
    else{
        return false;
    }

    
}