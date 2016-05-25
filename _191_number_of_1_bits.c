#include <stdio.h>
#include <stdint.h>

int hammingWeight(uint32_t n) {
    int count;
    for (count=0; n; count++){
        n &= n-1;     
    }
    return count; 
}

int main()
{
	/* code */
	printf("res:%d\n", hammingWeight(11));
	return 0;
}