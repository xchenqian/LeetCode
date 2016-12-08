#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    bool search(vector<int>& nums, int target) {
        int flag = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
};

int main(){
    vector<int> nums = {2, 3, 3, 4, 6, 0, 1, 1};
    Solution s;
    cout << s.search(nums, 1) << endl;
}
