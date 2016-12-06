#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        if(nums.size() == 0){
            return 0;
        }
        int start = 0, end = nums.size() - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }

        if(nums[start] >= target){
            return start;
        }else if(nums[end] >= target){
            return end;
        }else{
            return end + 1;
        }
//        auto first = lower_bound(nums.begin(), nums.end(), target);
//        
//        return first-nums.begin();
    }
};

int main(){
    Solution s;
    vector<int> nums = {1, 3, 5};
    cout << "res: " << s.searchInsert(nums, 2);
    return 0;
}
