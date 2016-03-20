#include<stdio.h>

void moveZeroes(int* nums, int numsSize) {
    int i,pos=0;
    for(i=0;i<numsSize;i++){
    	if(nums[i]!=0){
    		nums[pos]=nums[i];
    		pos++;
    	}   
    }
    for (; pos < numsSize; ++pos)
    {
    	nums[pos]=0;
    }
}

int main(){
	int numsSize=2;
	int nums[]={0,1};
	moveZeroes(nums,numsSize);
	return 0;
}