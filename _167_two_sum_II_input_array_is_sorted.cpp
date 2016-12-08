#include<iostream>
#include<vector>
#include<map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> res;
        map<int, int> hash;
        for(int i = 0; i < numbers.size(); i++){
            auto it = hash.find(target - numbers[i]);
            if(it != hash.end()){
                res.push_back(it->second + 1);
                res.push_back(i + 1);
                break;
            }
            hash[numbers[i]] = i;
        }
        return res;
    }

};

int main(){
    Solution s;
    vector<int> numbers = {0, 0, 3, 4};
    vector<int> res = s.twoSum(numbers, 0);
    for(auto i : res){
        cout << i << endl;
    }
    return 0;
}
