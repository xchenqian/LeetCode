#include<stdio.h>
#include<string.h>

int isPalindrome(char* s) {
    int len=strlen(s);
    int temp[len],i,k=0;
    for(i=0;i<len;i++){
    	if(isalnum(s[i])){
    		if(isupper(s[i])){
    			s[i]=s[i]+32;
    		}
    		temp[k++]=s[i];
    	}
    }
    if(!k){
    	return 1;
    }
    /*for(i=0;i<=k/2;i++){
    	if(temp[i]!=temp[k-i-1]){
    		return 0;
    	}
    }*/
    int left=0,right=k-1;
    while(left<right){
    	if(temp[left]!=temp[right]){
    		return 0;
    	}
    	left++;
    	right--;
    }
    return 1;
}

int main()
{
	char s[]="'''''";
	if(isPalindrome(s)){
		printf("yes!\n");
	}else{
		printf("no!\n");
	}
	return 0;
}