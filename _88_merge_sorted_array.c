#include<stdio.h>

void merge(int* nums1, int m, int* nums2, int n) {
	int i=0,j=0,k=0;
	int temp[m+n];
	while(i<m&&j<n){
		if(nums1[i]<=nums2[j]){
			temp[k++]=nums1[i++];
		}else{
			temp[k++]=nums2[j++];
		}
	}
	while(i<m){
		temp[k++]=nums1[i++];
	}
	
	while(j<n){
		temp[k++]=nums2[j++];
	}
	
	for(i=0;i<m+n;i++){
		nums1[i]=temp[i];
	}

}

int main(){
	int m=100,n=5;
	int nums1[100]={1,3,4,9,10,51};
	int nums2[]={2,4,6,8,52};
	merge(nums1,6,nums2,5);
	return 0;
}