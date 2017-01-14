class Solution {
public:
    int findMin(vector<int>& nums) {
        if(nums.size()==0) return 0;
        int low = 0, high = nums.size() - 1, mid = 0;
        while(low < high){
            if(low == high - 1) break;
            if(nums[low] < nums[high]) return nums[low];
            mid = low + (high - low) / 2;
            if(nums[low] > nums[mid]){
                high = mid;
                continue;
            }
            if(nums[mid] > nums[high]){
                low = mid;
                continue;
            }
            while(low < mid){
                if(nums[low] == nums[mid]){
                    low++;
                }else if(nums[low] < nums[mid]){
                    return nums[low];
                }else{
                    high = mid;
                    break;
                }
            }
        }
        return min(nums[low], nums[high]);
    }
};