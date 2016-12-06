#include<iostream>
#include<cmath>

using namespace std;

class Solution {
public:
    double myPow(double x, int n) {
        if(n < 0){
            return 1.0 / power(x, -n);
        }
        return power(x, n);
    }

private:
    double power(double x, int n){
        if(x == 1){
            return 1;
        }
        if(n == 0){
            return 1;
        }
        double v = power(x, n/2);
        if(n % 2 == 0){
            return v*v;
        }else{
            return v*v*x;
        }
    }
};

int main(){
    Solution s;
    cout << "res: " << s.myPow(2, 0.5) << endl;

}
