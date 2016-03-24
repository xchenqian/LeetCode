#include<stdio.h>

/* 使用附加数组

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
*/

void merge(int* nums1, int m, int* nums2, int n) {
	int i=m-1,j=n-1,k=m+n-1;
	while(i>=0 && j>=0){
		if(nums1[i]>=nums2[j]){
			nums1[k--]=nums1[i--];
		}else{
			nums1[k--]=nums2[j--];
		}
	}
	while(j>=0){
		nums1[k--]=nums2[j--];
	}
	for(i=0;i<m+n;i++){
		printf("%d:%d\n", i, nums1[i]);
	}
}

int main(){
	int nums1[]={1,2,4,9,10,51};
	int nums2[]={3,4,6,8,52};
	merge(nums1,6,nums2,5);
	return 0;
}