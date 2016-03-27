#include<stdio.h>


int getDivide(int n){
	int rem,ans=0;
	while(n){
    	rem=n%10;
    	n/=10;
    	ans+=rem*rem;
    }
    return ans;
}

int isHappy(int n) {
	int sum[1000],i=0,k;
	while(1){
		n=getDivide(n);	
		if(n==1){
			return 1;
		}
		for(k=0;k<i;k++){
			if(n==sum[k]){
				return 0;
			}
		}
		sum[i++]=n;
	}
}

int main(){
	int n;
	printf("input n:");
	scanf("%d",&n);
	if(isHappy(n)){
		printf("yes!\n");
	}else{
		printf("no!\n");
	}
	return 0;
}