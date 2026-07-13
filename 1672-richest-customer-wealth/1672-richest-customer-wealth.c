int maximumWealth(int** accounts, int accountsSize, int* accountsColSize) {
    
    int* ans = (int*)malloc(accountsSize * sizeof(int));

    for(int i=0;i<accountsSize;i++){
        int sum=0;
        for(int j=0;j<accountsColSize[i];j++){
            sum+=accounts[i][j];
        }
        ans[i]=sum;
    }

    int max=ans[0];

    for(int i=1;i<accountsSize;i++){
        if(ans[i]>max){
            max=ans[i];
        }
    }

    return max;


}