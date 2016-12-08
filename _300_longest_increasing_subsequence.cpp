#include<iostream>
#include<vector>
#include<climits>
using namespace std;

class Solution {
public:
    //O(n^2)
    int lengthOfLIS(vector<int>& nums) {
        int lis[nums.size()];
        int max = 0;

        //lis[i]表示以nums[i]结尾的lis的长度
        for(int i = 0; i < nums.size(); i++){
            lis[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    lis[i] = lis[i] > lis[j] + 1 ? lis[i] : lis[j] + 1;
                }
            }
            if(lis[i] > max){
                max = lis[i];
            }
        }

        return max;
    }
    
    //O(nlogn)
    int lengthOfLIS2(vector<int>& nums){
        int lis[nums.size()];
        vector<int> minLast;  //nums.size() + 1
        minLast.push_back(INT_MIN);
        for(int i = 0; i < nums.size(); i++){
            minLast.push_back(INT_MAX);
        }
        
        for(int i = 0; i < nums.size(); i++){
            int index = binarySearch(minLast, nums[i]);
            minLast[index] = nums[i];
        }

        for(int i = nums.size(); i > 0; i--){
            if(minLast[i] != INT_MAX){
                return i;
            }
        }
        return 0;
    }

private:
    //return first index which is larger than num
    int binarySearch(vector<int>& minLast, int num){
        int left = 0, right = minLast.size() - 1;
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(minLast[mid] > num){
                right = mid;
            }else if(minLast[mid] < num){
                left = mid;
            }else{
                return mid;
            }   
        }
        if(minLast[left] > num){
            return left;
        }
        return right;
    }

};

int main(){
    Solution s;
    vector<int> nums = {10, 9, 2, 5, 3, 7, 101, 18};
    cout << "res: " << s.lengthOfLIS2(nums) << endl;
    return 0;
}
