/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    while(head && head->val==val){
        head=head->next;
    } 

    if(!head){
        return NULL;
    }

    struct ListNode* ptr=head;

    while(ptr->next){

    if(ptr->next->val==val){
        ptr->next=ptr->next->next;
    }
    else{
        ptr=ptr->next;
    }
    }

    return head;
}

