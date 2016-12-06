#include<iostream>

using namespace std;

class Solution {
public:
    int arrangeCoins(int n) {
        int cnt = 0;
        int row = 1;
        while(n >= row){
            n -= row;
            row++;
            cnt++;
        }
        return cnt;
    }
};

int main(){
    Solution s;
    cout << "res: " << s.arrangeCoins(3) << endl;
}
