/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    bool* ans = (bool*)malloc(candiesSize * sizeof(bool));

    for(int i = 0; i < candiesSize; i++){
        int max = candies[i] + extraCandies;
        bool flag = false;

        for(int j = 0; j < candiesSize; j++){
            if(max >= candies[j]){
                flag = true;
                
            }
            else{
                flag = false;
                break;
            }
        }

        if(flag){
            ans[i] = true;
        }
        else{
            ans[i] = false;
        }
    }

    *returnSize = candiesSize;

    return ans;
}