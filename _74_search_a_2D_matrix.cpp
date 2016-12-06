#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rows = matrix.size();
        int columns = matrix[0].size();
        int start = 0, end = rows*columns - 1;
        bool found = false;
        
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            int num = matrix[mid/columns][mid%columns];
            if(num == target){
                found = true;
                break;
            }else if(num < target){
                start = mid;
            }else{
                end = mid; 
            }
        }
        
        if(matrix[start/columns][start%columns] == target){
            found = true;
        }
        if(matrix[end/columns][end%columns] == target){
            found = true;
        }

        return found;
    }
};


int main(){
    Solution s;
    vector<vector<int>> matrix = {{1,   3,  5,  7},
                                  {10, 11, 16, 20},
                                  {23, 30, 34, 50}};

    cout << "res: " << s.searchMatrix(matrix, 10) << endl;

}
