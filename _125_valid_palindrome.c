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
    for(i=0;i<=k/2;i++){
    	if(temp[i]!=temp[k-i-1]){
    		return 0;
    	}
    }
    return 1;
}

int main()
{
	char s[]="A man, a plan, a canal: Panama";
	if(isPalindrome(s)){
		printf("yes!\n");
	}else{
		printf("no!\n");
	}
	return 0;
}