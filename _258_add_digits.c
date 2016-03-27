#include<stdio.h>

int getDivide(int n){
	int rem,ans=0;
	while(n){
    	rem=n%10;
    	n/=10;
    	ans+=rem;
    }
    return ans;
}

int addDigits(int num) {
	int answer;
	while(1){
		answer=getDivide(num);
		if(answer<10){
			return answer;
		}
		num=answer;    	
    }
}

int main(){
	int num;
	printf("input num:");
	scanf("%d",&num);
	printf("answer:%d\n", addDigits(num));
	return 0;
}