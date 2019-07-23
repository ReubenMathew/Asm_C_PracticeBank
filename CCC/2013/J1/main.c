#include <stdio.h>

int main() {
    int age1;
    int age2;
    
    scanf("%d",&age1);
    scanf("%d",&age2);
    int diff = age2 - age1;
    
    int age3 = age2+diff;
    
    printf("%d",age3);
    return 0;
}
