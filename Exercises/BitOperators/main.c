#include <stdio.h>

int main(){
	unsigned int a = 15; /* 0000 1111 */
	unsigned int b = 30; /* 0001 1110 */

	int c = 0;

	c = a & b;
	printf("AND %d\n",c);
	c = a | b;
	printf("OR %d\n",c);

	c = ~a;
	printf("COMPLEMENT %d\n", c);

	c = a ^ b;
	printf("XOR %d\n",c);

	c = a >> 2;
	printf("BIT SHIFT RIGHT %d\n",c);

	c = a << 2;
	printf("BIT SHIFT LEFT %d\n",c);


	return 0;

}
