/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int rows = matrixSize;
    int cols = matrixColSize[0];

    *returnSize = rows * cols;

    int *ans = (int *)malloc((*returnSize) * sizeof(int));

    int top = 0;
    int bottom = rows - 1;
    int left = 0;
    int right = cols - 1;

    int k = 0;

    while (top <= bottom && left <= right) {

        // Left -> Right
        for (int j = left; j <= right; j++) {
            ans[k++] = matrix[top][j];
        }
        top++;

        // Top -> Bottom
        for (int i = top; i <= bottom; i++) {
            ans[k++] = matrix[i][right];
        }
        right--;

        // Right -> Left
        if (top <= bottom) {
            for (int j = right; j >= left; j--) {
                ans[k++] = matrix[bottom][j];
            }
            bottom--;
        }

        // Bottom -> Top
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                ans[k++] = matrix[i][left];
            }
            left++;
        }
    }

    return ans;
}