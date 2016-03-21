#include<stdio.h>

int containsDuplicate(int* nums, int numsSize) {
    int i,j;
    int temp[numsSize];
    for(i=1;i<numsSize;i++){
    	for(j=0;j<i;j++){
    		if(nums[i]==nums[j]) return 1;
    	}
    }
    return 0;
}
int main(){
	int numsSize=5;
	int nums[]={1,2,12,0,3};
	if(containsDuplicate(nums,numsSize)){
		printf("true");
	}else{
		printf("false");
	}
	return 0;
}