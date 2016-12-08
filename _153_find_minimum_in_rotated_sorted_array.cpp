#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

class Solution {
public:
    int findMin(vector<int>& nums){
        int left = 0, right = nums.size() - 1;
        while(nums[left] > nums[right]){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= nums[left] && nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }

    int findMin2(vector<int>& nums) {
        int left = 0, right = nums.size() - 1;
        if(left == right){
            return nums[0];
        }
        if(left + 1 == right){
            return min(nums[0], nums[1]);
        }
        return search(nums, left, right);
    }

private:
    int search(vector<int>& nums, int left, int right){
        if(nums[left] <= nums[right]){
            return nums[left];
        }else{
            int mid = left + (right - left) / 2;
            return min(search(nums, left, mid), search(nums, mid + 1, right));
        }
    
    }
};

int main(){
    Solution s;
    vector<int> nums = {1, 2};
    cout << "res: " << s.findMin(nums) << endl;   
}
