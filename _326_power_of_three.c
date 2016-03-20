#include <stdio.h>
#include <math.h>

bool isPowerOfThree(int n) {
    double re;
    re=log10(n)/log10(3);
    return (re-(int)(re)==0)?true:false;
}

int main(){
        int n;
        scanf("%d",&n);
        int ans=isPowerOfThree(n);
        printf("%d\n", ans);
        //printf("%d\n", isPowerOfThree(n));
        return 0;
}