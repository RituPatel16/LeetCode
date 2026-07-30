int max(int n1,int n2){
    if(n1 > n2){
        return n1;
    }
    else{
        return n2;
    }
}

int min(int n1,int n2){
    if(n1 > n2){
        return n2;
    }
    else{
        return n1;
    }
}
int trap(int* height, int heightSize) {
    int water;
    int leftMax[heightSize];
    int rightMax[heightSize];

    leftMax[0] = height[0];

    for(int i = 1; i < heightSize; i++){
        leftMax[i] = max(leftMax[i-1], height[i]);
    }

    rightMax[heightSize - 1] = height[heightSize - 1];

    for(int i = heightSize - 2; i >= 0; i--){
        rightMax[i] = max(rightMax[i+1], height[i]);
    }

    for(int i = 0; i < heightSize; i++){
        water += min(leftMax[i], rightMax[i]) - height[i];
    }

    return water;



}