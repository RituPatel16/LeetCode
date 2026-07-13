/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 int countNodes(struct TreeNode* root) {
    if (root == NULL) return 0;
    return 1 + countNodes(root->left) + countNodes(root->right);
}

void preorderHelper(struct TreeNode* root, int* arr, int* index) {
    if (root == NULL) return;

    arr[(*index)++] = root->val;
    preorderHelper(root->left, arr, index);
    preorderHelper(root->right, arr, index);
}

int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize = countNodes(root);              // count total nodes
    int* result = (int*)malloc((*returnSize) * sizeof(int));

    int index = 0;
    preorderHelper(root, result, &index);

    return result;   // caller (LeetCode) will free()
}

