/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* newhead = new ListNode(-1);
        ListNode* head = newhead;
        if(list1 == NULL) return list2;
        else if(list2 == NULL) return list1;
        else if(list1 == NULL && list2 == NULL) return list2;
        while(list1 && list2){
                if(list1->val <= (list2->val)){
                    head->next = list1;
                    head = head->next;
                    list1 = list1->next;
                }else{
                    head->next = list2;
                    head = head->next;
                    list2 = list2->next;
                }
            }
            while(list1){
                head->next = list1;
                list1 = list1->next;
                head = head->next;
            }
            while(list2){
                head->next = list2;
                list2 = list2->next;
                head = head->next;
            }
        
        return newhead->next;
    }
};