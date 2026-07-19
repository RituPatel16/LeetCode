int sumOfDigits(int temp){

    int sum = 0;

    while(temp!=0){
        int r = temp % 10;
        sum += r;
        temp /= 10;
    }

    return sum;
}

int addDigits(int num) {
    int temp = num;
    
    while(temp > 9){
        temp = sumOfDigits(temp);
    }

    return temp;

    


}