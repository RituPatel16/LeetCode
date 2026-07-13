int findLucky(int* arr, int arrSize) {

    int lucky=-1;
    int max = -1;

    for(int i = 0; i < arrSize; i++){
        int n = arr[i];
        int count = 0;
        

        for(int j = 0; j < arrSize; j++){
            if(arr[j] == n){
                count++;
            }
        }

        if(count == n){

            if(n > max){
                max = n;
                lucky = n;
            }
            
            
        }

        
    }

    return lucky;
}