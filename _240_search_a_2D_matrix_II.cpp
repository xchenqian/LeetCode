#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rows = matrix.size();
        int columns = matrix[0].size();
        int i = 0, j = columns - 1;
        bool found = false;

        while(i < rows && j >= 0){
            if(matrix[i][j] == target){
                found = true;    
                break;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }

        return found;
    }


};

int main(int argc, char *argv[]){
   Solution s;
   vector<vector<int>> matrix = {{1,4,7,11,15},
                                 {2,5,8,12,19},
                                 {3,6,9,16,22},
                                 {10,13,14,17,24},
                                 {18,21,23,26,30}};
   
   for(auto &row : matrix){
        for(auto col : row){
            cout << col << ",";
        }
        cout << endl;
   }

   cout << "res: " << s.searchMatrix(matrix, 5) << endl;

}
