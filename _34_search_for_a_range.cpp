#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> res;
        int left = -1, right = -1;
        auto it = find(nums.begin(), nums.end(), target);
        if(it != nums.end()){
            left = it - nums.begin();
        }

        auto r_it = find(nums.rbegin(), nums.rend(), target);
        if(r_it != nums.rend()){
            right = nums.rend() - r_it - 1;
        }

        res.push_back(left);    
        res.push_back(right);
        return res;
    }
};

int main(){
    Solution s;
    vector<int> nums = {5, 7, 7, 8, 8, 10};
    vector<int> res = s.searchRange(nums, 8);
    for(auto elem : res){
        cout << elem << " ";
    }
    return 0;
}
