#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        return find(nums, 0, nums.size()-1, target);
    }

private:
    int find(vector<int>& nums, int left, int right, int target){
        if(right < left){
            return -1;
        }
        int res = -1;
        if(nums[left] <= nums[right]){
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] > target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }else{
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            res = find(nums, left, mid - 1, target);
            res = res == -1 ? find(nums, mid + 1, right, target) : res; 
        }
        return res;
    }
};

int main(){
    Solution s;
    vector<int> nums = {1, 3};
    cout << "res: " << s.search(nums, 1) << endl;
}
