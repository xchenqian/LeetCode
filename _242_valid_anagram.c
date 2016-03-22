#include<stdio.h>
#include<string.h>

int isAnagram(char* s, char* t) {
    if(!strlen(s)&&!strlen(t)){
        return 1;
    }
    if(strlen(s)!=strlen(t)){
    	return 0;
    }
    int alpha[26]={0},i;
    for(i=0;i<strlen(s);i++){
    	alpha[s[i]-'a']++;
    }
    for(i=0;i<strlen(t);i++){
    	alpha[t[i]-'a']--;
    }
    for(i=0;i<26;i++){
    	if(alpha[i]){
    		return 0;
    	}
    }
    return 1;
}
int main()
{
	char s[]="anagram";
	char t[]="naagram";
	if(isAnagram(s,t)){
		printf("yes,it is a valid anagram\n");
	}else{
		printf("no,it is not a valid anagram\n");
	}
	
	return 0;
}