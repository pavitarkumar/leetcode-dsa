class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int k = m + n - 1;
        m = m-1;
        n  = n-1;
        while(m >=0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[k] = nums1[m];
                k--;
                m--;
            }else{
                nums1[k] = nums2[n];
                n--;
                k--;
            }
        }
        while(n >= 0){
            nums1[k] = nums2[n];
            k--;
            n--;
        }
    }
};